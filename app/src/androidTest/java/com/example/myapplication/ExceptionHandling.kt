package com.example.myapplication

fun main(){

    /*val arr = arrayOf(1,2,3)
    println(arr[5])// they come error because array index 3 and i call 5th index.
    println("This will Not run because outside the Boundary of index")
    //if the error come so the next code not execute so i use the try catch handle the Exception.*/



   /* val arr = arrayOf(1,2,3)
    try {
        println(arr[5]) // if the chance exception is come i write try block

    }
    catch (ex:NullPointerException){

    }
    catch(e:Exception){
        println("Please Check The array index")// if the exception is come he enter the catch block

    }
    finally {
        println("I will execute No matter what")
    }*/



    createUserList(5)
    createUserList(10)
    createUserList(-2)


}

fun createUserList(count:Int){
    if (count<0){
        throw IllegalArgumentException("Count Must be greater Then O")//Exception Raise

    }
    else{
        println("User list containing $count users")
    }
}