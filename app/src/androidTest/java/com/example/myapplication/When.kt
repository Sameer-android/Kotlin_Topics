package com.example.myapplication

/*fun main (args : Array<String>) {
    print("Enter the name of heavenly body: ")
    var name= readLine()!!.toString()
    when(name) {
        "Sun" -> print("Sun is a Star")
        "Moon" -> print("Moon is a Satellite")
        "Earth" -> print("Earth is a planet")
        else -> print("I don't know anything about it")
    }
}*/

fun main(args : Array<String>) {
    print("Enter number of the Month: ")
    var monthOfYear = readLine()!!.toInt()
    var month= when(monthOfYear) {
        1->"January"
        2->"February"
        3->"March"
        4->"April"
        5->"May"
        6->"June"
        7->"July"
        8->"August"
        9->"September"
        10->"October"
        11->"November"
        12->"December"
        else-> "Not a month of year"
    }
    print(month)
}

