package com.example.recyclerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MyRecyclerAdapter: RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        val  usernameTextView:TextView
        val  profileImageView: ImageView

        init {
            usernameTextView = itemView.findViewById(R.id.user_name)
            profileImageView = itemView.findViewById(R.id.pro_img)
        }
        //d
        fun bind(myModel: MyModel) {
            usernameTextView.text = myModel.name
            //profileImageView.
            Glide
                .with(App.instance)
                .load(myModel.profileImage)
                //.centerCrop()
                //.placeholder(R.drawable.ic)
                .into(profileImageView);
        }
    }
    private var modelList = ArrayList<MyModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val item_layout = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        return MyViewHolder(item_layout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind( this.modelList[position] )
    }

    override fun getItemCount(): Int {
        return this.modelList.size;
    }

    fun submitList(modelList:ArrayList<MyModel>) {
        this.modelList = modelList
    }
}