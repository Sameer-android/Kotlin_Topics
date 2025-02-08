package com.example.myapplication

/*
Abstract means kuch where the scenerio in the time class method not define And the Child class
define the method. generally abstract class is a parent class where i am say the child class inharit
define the methods of this class.
 */

fun main(){
    val circle = Circl(4.0)
    println(circle.area())
    circle.display()
}

abstract class Shap{
    abstract fun area():Double
    abstract fun display()
}
class Circl(val radius:Double):Shap(){
    override fun area(): Double = Math.PI*radius*radius

    override fun display() {
        println("Circle is getting displayed")
    }

}