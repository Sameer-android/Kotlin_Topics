package com.example.myapplication

fun main() {
    MyClass.f()
}

class MyClass{
    companion object MyObject{
        fun f(){
            println("Hello I am F from object")
        }
    }
}








