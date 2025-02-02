package com.example.myapplication

/*
open class Person(age:Int,name:String){
    init {
        println("My name is $name")
        println("My age is $age")
    }
}

class MathTeacher(name: String,age: Int) : Person(age,name){
    fun teachMath(){
        println("I tech in primary school")
    }
}

class FootBaller(name: String,age: Int):Person(age,name){
    fun playFootball(){
        println("I play for LA Galaxy.")
    }
}

fun main(){
    val t1 = MathTeacher("Rakesh Kumar",55)
    t1.teachMath()
    println()

    val f1 = FootBaller("Ronaldo",32)
    f1.playFootball()
}*/




/*
open class Mobile(){
    open val name:String = ""
    val size:Int = 5

    fun makeCall(){}
    fun powerOff(){}
    open fun display()=println(" display")

}

class OnePlus:Mobile(){
    override val name:String = "One plus"
    override fun display(){
        super.display()
        println("One Plus Display")
    }
}
fun main(){
    val onePlus = OnePlus()
    onePlus.name
    onePlus.display()

    val generalMobile = Mobile()
    generalMobile.display()
}*/




/*open class Employee(name:String,age:Int,salary:String){
    init {
        println("Employee Name is $name And Age is $age or Salary is $salary")
    }
}

class IosDeveloper(name: String,age: Int,salary: String):Employee(name,age,salary){
    fun iosDev(){
        println("I am build the Good class Ios Apps")
    }
}

class AndroidDeveloper(name: String,age: Int,salary: String):Employee(name,age,salary){
    fun androidDev(){
        println("Build a Android App")
    }
}

class WebsiteDevloper(name: String,age: Int,salary: String):Employee(name,age,salary){
    fun webDev(){
        println("Website Developer")
    }
}

fun main(){
    val iosDev = IosDeveloper("Sr.Danish Khan",24,"10000")
    iosDev.iosDev()
    val android = AndroidDeveloper("Sr.Sahil Sir",25,"12000")
    android.androidDev()
    val website = WebsiteDevloper("Karan",18,"8000")
    website.webDev()

}*/
