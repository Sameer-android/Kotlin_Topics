package com.example.myapplication

fun main(){
    var gender : String = "Male"
    var gender2 : String? = null                       //Nullable Type null means absence of value.

    if (gender2 != null) {                         //Souround with null Check option.
        gender2.uppercase()
        println("$gender2")
    }

    gender2?.uppercase()                                 //Safe Call Operator
    println("$gender2")                                 //Muje bar bar if use na krna pade to Kotlin Ne Safe Call
                                                        //operator bnaya hai.



    gender2?.let {
        println("Line 1")
        println("Line 2 $gender2")
        println("Line 3 $it")
    }

    var selectedValue = gender2 ?: "Default Value"           // Elvish Operator or Ternary Operator
    //Yeh kaya krega ki gender2 ki value hai to lega varna default lega.


    var value = gender2!!.uppercase()                     // Not Null Aserted Operator
//Yeh operator kehta hai ager fun Not null hoga to me function call kr lunga or null hoga to error
    //throw kr dunga .Exception Raise hu jaye ga.
    //Yeh operator tabhi call kare Tab hum Sure hu ki Null nhi huga ya fir Hum Chate hai Error Ajaye.
}