package com.example.recyclerviewtest

import android.util.Log

class MyModel(var name:String? = null, var profileImage:String? = null)  {
    val TAG : String = "로그"

    init {
        Log.d(TAG, "MyModel - init() called")
    }
}


// eeee