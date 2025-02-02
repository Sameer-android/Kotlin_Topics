package com.example.myapplication

import android.util.Log
import android.view.View
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main(){

}
/*
fun doAction(view:View){
    CoroutineScope(Dispatchers.IO).launch {
        Log.d("-1","${Thread.currentThread().name}")
    }
    GlobalScope.launch(Dispatchers.Main) {
        Log.d("-2","${Thread.currentThread().name}")
    }
    MainScope().launch (Dispatchers.Default) {
        Log.d("-3","${Thread.currentThread().name}")
    }
}*/
