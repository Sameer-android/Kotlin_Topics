package com.example.myapplication

fun main(){
    /*Array is Simple object that stores multiple value of SAME TYPE.
    fixed size
    Arrays are used to store multiple values in a single variable*/

    var arr = arrayOf("mon","tues","wed")
    for (i in arr){
        println(i)
    }
    println(arr[0])
    println(arr.get(1))
    arr.set(0,"Sunday for fun")
    println(arr[0])

}