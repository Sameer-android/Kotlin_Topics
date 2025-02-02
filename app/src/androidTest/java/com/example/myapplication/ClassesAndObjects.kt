package com.example.myapplication

import android.icu.util.CurrencyAmount

fun main(){
    /*//Is tarike se hamare method property ke base pr kaam karte hai
    val sameer = Person("Sameer",21)
    val umair = Person("Umair",17)

    println(sameer.canVote())
    println(umair.canVote())

    umair.age = 20
    println(umair.canVote())*/

    /*//Example of primary constructor
    var person = Person("Sameer",21)
    println(person.name)
    println(person.age)
    println(person.canVote)*/

    /*//SECONDARY CONSTRUCTOR
    var car = AutoMobile("Car",4,5,"Petrol")
    var car2 = AutoMobile("Car2",4,5,"Diesel")
    //after secondaryConstructor
    var car3 = AutoMobile("Car3","Electric")*/

    val account = BankAccount("SBI12345",2000.0,"Sameer")
    account.displayAccDetails()
    account.deposit(500.0)
    account.withdraw(1000.0)
    account.withdraw(2000.0)
    println()

    val account2 = BankAccount("PNB569",5000.0,"MAHI")
    account2.displayAccDetails()
    account2.withdraw(2000.0)
    account2.deposit(2500.0)



}
/*class Person(val name:String,var age:Int){

    fun canVote():Boolean{
        return age>18
    }
}*/

/*//Example of Primary Constructor
class Person(nameParam:String,ageParam:Int)
{
    val name:String = "$nameParam - good for primary constructor"
    val age:Int = ageParam
    val canVote = age>18

    init {
        println("Init block property define hune ke baad call huta hai.")
    }
}*/

/*//SECONDARY CONSTRUCTOR
class AutoMobile(val name:String,val tyres:Int,val maxSeating:Int,val engineType:String)
{
    constructor(nameParam:String,engineParam:String):
            this(nameParam,4,5,engineParam)
}*/

/*//Write a Kotlin program that creates a class 'Rectangle' with properties for width and height. Include a function to calculate the rectangle area.
class Rectangle(val width:Double, val height:Double)
{
    fun calculateArea():Double
    {
        return width*height
    }
}*/

/* Q-> Write a Kotlin program that creates a class 'BankAccount' with properties for account number,
 balance, and account holder name. Include deposit and withdrawal functions.*/

class BankAccount(
    val accountNumber : String,
    var balance : Double,
    val accountHolderName : String
){
    fun deposit(amount:Double){
        balance += amount
        println("Deposit of $amount is Succesfull, New Balance is $balance")
    }

    fun withdraw(amount:Double){
        if (balance >= amount){
            balance -= amount
            println("Withdraw amount is $amount, New Balance is $balance")
        }
        else{
            println("Insufficient Balance ($balance). Withdraw($amount) failed ")
        }
    }

    fun displayAccDetails(){
        println("Account No. is $accountNumber")
        println("Account Holder Name is $accountHolderName")
        println("Balance $balance")
    }
}


