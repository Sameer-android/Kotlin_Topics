package com.example.myapplication

import java.util.TreeSet


fun main(args: Array<String>) {
        /*Set – It is a collection of unordered elements also it does not support duplicate elements.
        It is a collection of unique elements. Generally, the order of set elements does not have a significant effect.
        We can not perform add or remove operations because it is an immutable Set.*/

        /*Kotlin HashSet is a generic unordered collection of elements and it does not contain duplicate elements.
    It implements the set interface. hashSetOf() is a function that returns a mutable hashSet,
    which can be both read and written. The HashSet class store all the elements using the hashing mechanism.*/

        // SETOF USING EXAMPLE.IMMUTABLE.
//    var immutableSet = setOf(6,9,9,0,0,"Mahipal","Nikhil")
//    for (item in immutableSet)
//        println(item)
//        //SETOF USING EXAMPLE.MUTABLE.
//    var mutableSet = mutableSetOf(6,9,9,0,"Mahipal","Nikhil")
//    mutableSet.add("Mr.Beast")
//    mutableSet.add(5)
//    for (item in mutableSet)
//        println(item)



    //Example of hashSetOf()
    //declaring a hash set of integers
//    val setA = hashSetOf(1,2,3,3)
//    //printing first set
//    println(setA)
//
//    //declaring a hash set of strings
//    val setB = hashSetOf("Geeks","for","geeks")
//    println(setB)



    //Kotlin program of using the add() and remove() method:
    //declaring a hash set of integers
//    val seta = hashSetOf<Int>()
//    println(seta)
//
//    //adding elements
//    seta.add(1)
//    seta.add(2)
//
//    //making an extra set to add it in seta
//    val newset = setOf(4,5,6)
//    seta.addAll(newset)
//
//    println(seta)
//
//    //removing 2 from the set
//    seta.remove(2)
//    println(seta)




    //We can traverse a hashSet using an iterator in a loop.
    //declaring a hash set of integers
//    val seta = hashSetOf(1,2,3,5)
//
//    //traversing in a set using a for loop
//    for(item in seta)
//        println(item)


   /*Both the methods are used to check whether an element is present in the Hashset or not?
    Kotlin program of using contains() and containsAll() function */
//       val captains = hashSetOf(1,2,3,4,"Kohli","Smith",
//           "Root","Malinga","Rohit","Dhawan")
//
//
//       var name = "Rohit"
//       println("The set contains the element $name or not?" +
//               " "+captains.contains(name))
//
//       var num = 5
//       println("The set contains the element $num or not?" +
//               " "+captains.contains(num))
//
//       println("The set contains the given elements or not?" +
//               " "+captains.containsAll(setOf(1,3,"Dhawan","Warner")))



    //Kotlin program of using isEmpty() function –
        //creating an empty hash set of strings
//        val seta = hashSetOf<String>()
//        //creating an empty hashset of integers
//        val setb =hashSetOf<Int>()
//
//
//        //checking if set is empty or not
//        println("seta.isEmpty() is ${seta.isEmpty()}")
//
//        // Since Empty hashsets are equal
//
//        //checking if two hash sets are equal or not
//        println("seta == setb is ${seta == setb}")


    //Here’s an example of using hashSetOf() to create a set of integers:
        // create a new hash set
//        val numbers = hashSetOf(1, 2, 3)
//
//        // add a new element to the set
//        numbers.add(4)
//
//        // remove an element from the set
//        numbers.remove(2)
//
//        // check if the set contains an element
//        val containsFive = numbers.contains(5)
//
//        // print the set and the result of the contains check
//        println("Numbers: $numbers")
//        println("Contains 5: $containsFive")

    /*Advantages of hashSetOf():
    The hash set data structure provides O(1) time complexity for adding, removing, and checking the presence of an element, making it very efficient for handling large sets of data.
    The hash set ensures that the elements are unique, so it is a good choice for keeping track of a collection of distinct values.
    The hashSetOf() function is easy to use and provides a simple way to create a new hash set with initial elements.*/

       // Kotlin TreeSet
    /*TreeSet is a collection of type Set, the provides maintains sorted order of elements,
and also unique elements (property of a Set). TreeSet implements the SortedSet interface. Optionally,
 we can provide a comparator to specify to the TreeSet how to compare the elements.*/

    /*In the following example, we created a TreeSet and created a list of Planets in the TreeSet.
 As you can see the planets are printed in Ascending order of alphabets. Hence,
 TreeSet is useful if we want to maintain sorted order of inputs.*/
        //alphabets Wise Add huga data isme.
//     var planet = TreeSet<String>()
//      planet.addAll(setOf("Mercury","Venus","Mars","Jupiter"))
//        for (moon in planet){
//                println(moon)
//        }
//        planet.add("Earth")
//        println("\n After Update")
//        for (moon in planet){
//                println("$moon")
//        }

        var planet1 = TreeSet<String>()
        planet1.addAll(setOf("Mercury","Venus","Jupiter","Earth"))
        println("Before The Clone")
        for (i in planet1){
                println(i)
        }

        var planet2 = planet1.clone()   as TreeSet<String>
        println("After The Clone")
        for (j in planet2){
                println(j)
        }
     println("First Num="+planet2.first())
        println("Last Num="+planet2.last())
        println("Does it contain Jupiter="+planet2.contains("Jupiter"))
        println("Does it contain Mars="+planet2.contains("Mars"))
        println("Size Check="+planet2.size)
        planet2.remove("Earth")
        for (planet in planet2){
                println("Planet is :$planet")
        }


        planet2.removeIf { x -> x.startsWith("A") }
        for (j in planet2){
                println(planet2)
        }
        println("Count The Element="+planet2.count())

        var plant = planet2.count() {x -> x.startsWith("A")}
        println("Count of planets starting with E in TreeSet = " + plant)



}
