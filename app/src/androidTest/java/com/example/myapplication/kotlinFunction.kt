package com.example.myapplication

fun main(){
    val num = 5
    val factorial = factorial(num)
    println("$num factorial is $factorial")
}

fun factorial(number:Int):Int
{
    if (number <=1){
        return 1
    }
    return factorial(number-1) * number
}

//Function parameters
/*fun myFunction(fname :  String,age : Int){
    println(fname +" is "+ age)
}*/

//print Star pattern
/*fun printStar(num:Int){
    for (j in 1..num){
        print("*")
    }
    println()
}*/

//print Whole asending triangle.
/*fun printStar(num:Int){
    for (j in 1..num){
        print("*")
    }
    println()
}
fun ascendingTriangle(height:Int){
    for (i in 1..height){
        printStar(i)
    }
}*/

//function both desending and isoscels triangle.
/*fun printStar(num:Int){
    for (j in 1..num){
        print("*")
    }
    println()
}
fun ascendingTriangle(height:Int){
    for (i in 1..height){
        printStar(i)
    }
    println()
}
fun deascendingTriangle(height: Int){
    for (star in height downTo 1)
        printStar(star)
}
fun isoscelesTriangle(width:Int){
    ascendingTriangle(width-1)
    deascendingTriangle(width)
}*/

/* print factorial Number
fun factorial (number: Int) : Int{
    if (number<=1){
        return 1
    }
    return factorial(number-1) * number
}*/

