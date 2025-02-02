package com.example.myapplication

class Company(){
    lateinit var name :String
    lateinit var city:String
    lateinit var founder:String
}
fun fullName(name:String):String{
    return name + "Sharma"
}
fun main(args:Array<String>){
    /*There are several functions in the Kotlin standard library that help in the execution of a block
    of code within the context of an object. Calling these functions on an object with lambda expression
     creates a temporary scope. These functions are called Scope Functions. We can access the object of
     these functions without its name. Sounds confusing! Let’s see an example */

    //Example: Without using scope function
//    var emp = Company()
//
//    emp.name = "Sameer"
//    emp.city = "Chd"
//    emp.founder = "Apps"
//
//    println(emp.name)

   // Example: Using scope function
//    var student = Company().apply {
//
//        name = "Sameer"
//        city ="Chd"
//        founder ="Apps"
//    }
//    Company().apply {
//        this.name="Mohit"
//        this.city="Delhi"
//        this.founder="JavaScript"
//    }

    /*While using the scope function, we can directly refer to members without the object name.
    This is one of the ways of using the scope function.*/

    //‘let’ for null safety and it.
//    student.let {
//        println(it.name)
//        println(it.city)
//        println(it.founder)
//    }

//    var emp: Company? = null

//    emp?.name = "Sameer"
//    emp?.city = "Chd"
//    emp?.founder = "Apps"
//    //bar bar safe call Na lagana pade Tu Hum let Use kr skte hai.
//   emp?.let {
//       it.name = "Sameer"
//       it.city = "Chd"
//       it.founder = "Apps"
//   }

    //bar bar it use na krna pade Tu Hum With Bhi use krte hai.
//    with(student){
//        name ="Sohan"
//        city = "Mohali"
//        founder = "Web"
//
//    }
//    var emp = User("Mohit","USA")
//    val newEmp = with(emp) {
//        name = "Mr.Manhotra"
//        address ="Californiya"
//        println("Name is $name And Address is $address")
//        name
//    }


    //‘run’ function can be said as the combination of ‘let’ and ‘with’ functions.
//    student.run {
//        name = "Innocent"
//        city = "Banglore"
//    }
//    println(student.name)
//    println(student.city)

//    println("Company Name:")
//    var company: Company? = null
//
//    company?.run {
//        print(name)
//    }
//    println("Company Name:")
//    company=Company().apply {
//        name = "Mohan"
//        city = "Gurdaspur"
//        founder = "Java"
//    }
//    company?.run {
//        print(  name)
//        print(city)
//        print(founder)
//    }
    /*Explanation:
    When the ‘company’ value is null, the body of the run is simply ignored.
    When it is non-null, the body executes.*/

//    var user = User("Mani","CaliForNiya")
//    val newUser = run {
//        fullName(user.name)
//    }


//USING ALSO.
// val Num = mutableListOf<Int>(1,2,3)
//// later if we want to perform
//// multiple operations on this list]
//    Num.also {
//        it.add(4)
//        it.remove(2)
//        println("Does it contain Element:"+it.contains(4))
//    }
//    println(Num)
    //It is used where we have to perform additional operations when we have initialized the object members.

    /*val user = User("mani","India")

    val updatedUser = user.apply {
        name = "Siva"
        address = "London"
    }.also {
        println(it)
    }*/


    /*Scope functions make code more readable, clear and concise.
     Object reference – ‘this’ and ‘it’.
     Return value – context object and lambda result.
     let : working with nullable objects to avoid NullPointerException.
     apply : changing object configuration.
     run: operate on nullable object, executing lambda expressions.
     also : adding additional operations.
     with : operating on non-null objects.*/

}