package com.example.myapplication

fun main(args:Array<String>){
    /* Map – Map keys are unique and hold only one value for each key, it is a set of key-value pairs.
    Each key maps to exactly one value. The values can be duplicates but keys should be unique.
    Maps are used to store logical connections between two objects, for example, a student ID and their name.*/
    //MAPOF USING EXAMPLE.
//    var mutableMap = mutableMapOf<Int,String>(1 to "Mahipal", 2 to "Nikhil", 3 to "Rahul")
//    mutableMap.put(1,"Praveen")
//    mutableMap.put(4,"Abhi")
//    for (item in mutableMap.values){
//        println(item)
//    }


    /*Kotlin hashMapOf()
    In Kotlin, hashMapOf() is used to create hash maps in data structure in kotlin.
    HashMap is a class which stores hashmaps and to initialize its object we use hashMapOf().
     hashMapOf() is a method of HashMap class and returns an instance of HashMap.
      It takes the key-value pair as parameter for initialization, the parameter is optional.
     */
    var hashmap = hashMapOf<Int,String>()
    hashmap.put(1,"Greeks")
    hashmap.put(2,"For")
    hashmap.put(3,"Greeks")
    hashmap.clear()
   println(hashmap)
}