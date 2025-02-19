package com.example.myapplication

import android.media.Image.Plane
import java.util.LinkedList

fun main(args: Array<String>) {
    /*In Kotlin, collections are used to store and manipulate groups of objects or data.
    There are several types of collections available in Kotlin, including:

    Lists – Ordered collections of elements that allow duplicates.
    Sets – Unordered collections of unique elements.
    Maps – Collections of key-value pairs, where each key is unique.
    Arrays – Fixed-size collections of elements with a specific type.
    Sequences – Lazily evaluated collections of elements that can be processed in a pipeline.*/

    /*List – It is an ordered collection in which we can access elements or items by using indices –
    integer numbers that define a position for each element. Elements can be repeated in a list any number of times.
     We can not perform add or remove operations in the immutable list.*/

    //THIS IS THE EXAMPLE OF LISTOF IMMUTABLE.
//    val immutableList = listOf("Sameer","Mohan","Sham")
//    for (item in immutableList){
//        println(item)
//    }



    /*It supports both read and write functionalities. Mutable collections and their corresponding methods are:

    List – mutableListOf(),arrayListOf() and ArrayList
    Set – mutableSetOf(), hashSetOf()
    Map – mutableMapOf(), hashMapOf() and HashMap*/

    // THIS IS THE EXAMPLE OF LISTOF MUTABLE
//    val mutableList = mutableListOf("Sameer","Mohan","Sham")
//    mutableList.add("Meena")
//    mutableList.add(1,"MrBoss")
//    for (name in mutableList){
//        println(name)
//    }

//        // THIS IS USE FOR MERGE THE LIST.
//    val mutableList2 = listOf("Ram","Ajay")
//    mutableList.addAll(mutableList2)
//    for (addName in mutableList2){
//        println(addName)
//    }

    /*ArrayList class is used to create a dynamic array in Kotlin. Dynamic array states that we can increase
     or decrease the size of an array as pre requisites. It also provide read and write functionalities.
     ArrayList may contain duplicates and is non-synchronized in nature. We use ArrayList to access
     the index of the specified element, convert an Arraylist into string or another array and many
      more functionalities.*/
    //<-ArrayList is Empty List or Dynamic.
    // ArrayList Size Increase or Decrease.
    //ArrayList me Only Empty list Create hugi or add se value dalni padegi.
    //Isliye Dynamic List kha jata h.

    // THIS IS THE EXAMPLE OF ARRAYLIST.
//    var arrayList = ArrayList<String>()
//    arrayList.addAll(listOf("Greeks","For","Greeks"))
////    arrayList.add("Greeks")
//
//    println("This is the array List ------->")
//    for (name in arrayList){
//        println(name)
//    }
//
//    println("After change of insertation----->")
//    arrayList.add(1,"for")
//    for (change in arrayList){
//        println(change)
//    }
//     println("This Websites for help the devlopers")
//    var arrayList2 = ArrayList<String>()
//    arrayList2.addAll(arrayList)
//    for (merge in arrayList2){
//        println(merge)
//    }

//    SET AND CLEAR USING.
// var arrayList = ArrayList<String>()
//    arrayList.add("Greeks")
//    arrayList.add("For")
//    arrayList.add("Greeks:")
//    arrayList.add("Portal")
//    arrayList.remove("Portal")
//    for (i in arrayList)
//        print("$i ")
//    println()
//    arrayList.set(2,"A Computer Science portal for Students")
//    for (j in arrayList)
//        print("$j ")
//    println()
//    arrayList.clear()
//        println(arrayList.size)

    /* ArrayList vs arrayListof.
     ArrayList me hum only Capacity dal sakte hai baad me add krna padega.
    but arrayListof me values bhi daal sakte hai jaise mutable Listof me daal sakte the.
     var name = ArrayList<String>() or (5) only array ki capacity de skte hai.
     var name = arrayListof<String>("Mahinder").*/

//    EXAMPLE OF arrayListof.AND USING ALL FUNCTION.
//    val list = arrayListOf(1, 2, 3)
//    println("Initial list : $list")
//
//    list.add(4)
//    list.add(1, 5)
//    println("After adding elements: $list")

//    list.remove(2)
//    list.removeAt(0)
//    println("After removing elements:$list")
//
//    list[0] = 6
//    println("After updating elements: $list")
//
//    val first = list[0]
//    val last = list.last()
//    println("First element:$first")
//    println("Last element:$last")
//
//    for (element in list) {
//        println(element)
//    }

    /*val emData = arrayListOf<Data>()
    val em1 = Data(1,"Sumit",98565415,"Mohali")
    val em2 = Data(2,"Mohan",98569852,"Chandigarh")
    val em3 = Data(3,"Mr Beast",85693256,"Gurugram")
    val em4 = Data(4,"Mr Beast",85693256,"Gurugram")

    emData.add(em1)
    emData.add(em2)
    emData.add(em3)
    emData.add(em4)

    for (i in emData){
       println("${i.id} ${i.name} ${i.phone} ${i.city}")
    }*/


    //Working with Kotlin LinkedList.
//    val linkedList = LinkedList<String>()
//    linkedList.add("Hello")
//    linkedList.add(0,"World")
//   linkedList.remove("Hello")
//    linkedList.removeAt(0)
//    for (element in linkedList)
//        println(element)
////sort Using And sortDescending.
//    val LinkedList = LinkedList(listOf(13,42,55,12,25))
//    LinkedList.sort()
//    println(LinkedList)
//
//    LinkedList.sortDescending()
//    println(LinkedList)
////Reverse.
//    LinkedList.reverse()
//    println(LinkedList)
//
//    //Searching the Element In LinkedList.
//    println(LinkedList.contains(12))
//   println( LinkedList.contains(20))

    /*val planet = LinkedList<String>()
    planet.addAll(listOf("venus","Mars","Earth"))
    println("first Planet ="+planet.first)
    println("first Planet ="+planet.last)
    planet.addFirst("Mercury")
    println("Planets ="+planet)
    planet.addLast("Pluto")
    println("Planets ="+planet)
    planet.removeFirst()
    println("Planets ="+planet)
    planet.removeLast()
    println("Planets =" + planet)
    for (i in planet){
        println(i)
    }
    planet.addAll(listOf("Jupiter","Saturn"))
    println()
    for (j in planet) {
        println(j)
    }
    println()
    planet.add(2,"Jupiter")
    for (a in planet){
        println(a)
    }
    println()
    if (planet.contains("Jupiter")){
        println("This is a Planet")
    }
    else{
        println("this is not a planet")
    }
    if (planet.contains("Chandigarh")){
        println("This is a planet")
    }
    else{
        println("This is not a planet")
    }
    println()
    planet.remove("Jupiter")
    println(planet)
    println()

    planet.removeAt(0)
    println(planet)
    println()

    planet.removeIf{x -> x.startsWith("J")}
    for (i in planet){
        println(i)
    }
println()
    planet.reverse()
    println(planet)
    */
}