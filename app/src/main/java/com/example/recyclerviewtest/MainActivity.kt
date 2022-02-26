package com.example.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // array
    var modelList = ArrayList<MyModel>()

    private lateinit var myRecyclerAdapter: MyRecyclerAdapter
    private lateinit var myRecyclerView: RecyclerView

    // seconding...


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for(i in 1..10) {
            var myModel = MyModel(name = "kimdo $i", profileImage = "https://source.unsplash.com/user/c_v_r/100x100")
            modelList.add( myModel )
        }

        myRecyclerAdapter = MyRecyclerAdapter()
        myRecyclerAdapter.submitList(modelList)

        myRecyclerView = findViewById(R.id.recyclerView)


        myRecyclerView.adapter = myRecyclerAdapter
        myRecyclerAdapter.notifyDataSetChanged()

        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        myRecyclerView.layoutManager = linearLayoutManager

    }
}