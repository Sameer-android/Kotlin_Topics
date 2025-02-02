package com.example.myapplication

import java.util.Vector


fun main(args: Array<String>){
//Kotlin Vector
    /*Vector is a wrapper over an array, where in the array can grow in size, or reduce in size dynamically,
     without the developer having to manage the size. Vector is part of Java Collections framework.
     We have access to Vector class in Kotlin through the Java Collections framework.*/

    /*Vector is synchronized, so it is a thread safe construct to use. If thread safety is not of your requirement,
     it is advisable to use an ArrayList instead. If vector is tried to be modified concurrently,
     it will throw ConcurrentModificationException.*/




    var planets =  Vector<String>()
    planets.addAll(listOf("Mercury", "Venus", "Earth", "Pluto"))
    println("Vector capacity = " + planets.capacity())


    var planet = Vector<String>()
    planet.addAll(listOf("Mercuty","Venus","Earth","Pluto"))
    planet.addElement("Serius A3")
    println("Vector ="+planet)


    var planet2 = Vector<String>()
    planet2.addAll(listOf("Mercuty","Venus","Earth","Pluto"))
    var planet2Reverse= planet2.reversed()
    println("Original Planets =")
    for (i in planet2){
        println(i)
    }
    println("\nPlanets Reversed =")
    for (j in planet2Reverse){
        println(j)
    }



}