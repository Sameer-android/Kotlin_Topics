package com.example.myapplication

fun main() {
    /*//WAP to largest and second largest Element In the Array?
    var arr = arrayOf(56,69,89,99,56,556,-96,20)
    var largest = 0
    var secondLargest = 0

    for (i in 0..arr.size-1){
        if (arr[i]>largest){
            largest = arr[i]
        }
    }
    for (i in 0..arr.size-1){
        if (arr[i]<largest && arr[i]>secondLargest){
            secondLargest = arr[i]
        }
    }
    println("The largest element is $largest")
    println("The Second largest element is $secondLargest")*/


    /*//WAP to Smallest and second smallest?
    val arr = arrayOf(63,56,99,56,44,96,-56)
    var smallest = Int.MAX_VALUE
    var secondSmallest = Int.MAX_VALUE

    for (i in 0..arr.size-1){
        if (arr[i]<smallest){
            smallest = arr[i]
        }
    }
    println("smallest No. is $smallest")

    for (i in 0..arr.size-1){
        if (arr[i]>smallest && arr[i]<secondSmallest){
            secondSmallest = arr[i]
        }
    }
    println("Second smallest is $secondSmallest")*/


    /*//WAP to reverse the array?
    println("The Original array is")
    var arr = arrayOf(25,52,4,6,9)
    for (i in 0..arr.size-1){
        println(arr[i])
    }
    println("The Reverse array is")
    for (i in arr.size-1 downTo   0){
        println(arr[i])
    }*/

    /*//Cyclically Rotate Array by One
     var arr = arrayOf(1,2,3,4,6,7)
     val x = arr[arr.size-1]

     for (i in arr.size-1 downTo 1){
         arr[i] = arr[i-1]
     }
     arr[0] = x
     println(arr.joinToString())*/

    //WAP sorting a array
    /*var arr = arrayOf(12, 56, 25, 53, -9, -15, 25)
    for (i in 0..arr.size - 1) {
        for (j in i + 1..arr.size - 1) {
            var temp = 0
            if (arr[i] > arr[j]) {
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
        println(arr[i])
    }*/
    /*println("Decending order")
    var arrDecending = arrayOf(12, 35, 68, 45, -25, -17)
    for (i in 0..arrDecending.size - 1) {
        for (j in i + 1..arrDecending.size - 1) {
            var temp = 0
            if (arrDecending[i] < arrDecending[j]) {
                temp = arrDecending[i]
                arrDecending[i] = arrDecending[j]
                arrDecending[j] = temp
            }
        }
        println(arrDecending[i])
    }*/


}