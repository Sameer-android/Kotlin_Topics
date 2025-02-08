package com.example.myapplication

fun main(){
    dragObjects(arrayOf(Circle(4.0),Square(4.0),Player("Smiley")))

}

interface Draggable{
    fun drag()
}

fun dragObjects(objects : Array<Draggable>){
    for (obj in objects){
        obj.drag()
    }
}

abstract class Shape:Draggable{
    abstract fun area():Double
}

class Circle(val radius : Double):Shape(){
    override fun area(): Double = Math.PI*radius*radius
    override fun drag() = println("Circle is dragging")
}

class Square(val side:Double):Shape(){
    override fun area(): Double {
        return side*side
    }

    override fun drag() {
        println("Square is dragging")
    }

}

class Player(val name:String):Draggable{
    override fun drag() = println("$name is dragging")
}