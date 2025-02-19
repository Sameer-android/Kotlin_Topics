package com.example.myapplication

/*
Solid Principal In Android
S- Single Responsibility Principal
O- Open Closed Principal
L- Liskow Substitution
I-Interface Segration
D-Dependency Inversion Principal
*/

/*Single Responsibility Principal:-
It is show the separation concern
Bad Example*/
/*class ShapeClass{
    fun calculateArea(){}
    fun calculateParameter(){}
    fun renderUi(){}
    fun renderSquareUi(){}
}
//Good Example
class ShapeClassUi{
    fun renderUi(){}
    fun renderSquareUi(){}

}*/


/*
2.Open Class Principal (OCP)
Classes should be open for extension but closed for modification.
You should be able to add new functionality without modifying existing code.

❌ Bad Example (Violating OCP)
class PaymentProcessor {
    fun process(paymentType: String) {
        if (paymentType == "CreditCard") {
            println("Processing credit card payment")
        } else if (paymentType == "PayPal") {
            println("Processing PayPal payment")
        }
    }
}
If you add a new payment method, you must modify this class (bad practice).

✅ Good Example (Following OCP)
interface Payment {
    fun processPayment()
}

class CreditCardPayment : Payment {
    override fun processPayment() {
        println("Processing credit card payment")
    }
}

class PayPalPayment : Payment {
    override fun processPayment() {
        println("Processing PayPal payment")
    }
}

class PaymentProcessor {
    fun process(payment: Payment) {
        payment.processPayment()
    }
}
Now, you can add new payment methods without modifying PaymentProcessor.
Just create a new class that extends Payment.

fun main() {
    val creditCardPayment = CreditCardPayment()
    val payPalPayment = PayPalPayment()

    val paymentProcessor = PaymentProcessor()

    // Process credit card payment
    paymentProcessor.process(creditCardPayment)

    // Process PayPal payment
    paymentProcessor.process(payPalPayment)
}

3. L - Liskov Substitution Principle (LSP)
Subclasses should be replaceable for their parent class without breaking the code.
// Interface instead of inheritance
interface Shape {
    fun getArea(): Int
}

// Rectangle implements Shape
class Rectangle(private var width: Int, private var height: Int) : Shape {
    override fun getArea(): Int {
        return width * height
    }
}

// Square implements Shape separately
class Square(private var side: Int) : Shape {
    override fun getArea(): Int {
        return side * side
    }
}

// Function works correctly now
fun printArea(shape: Shape) {
    println("Area: ${shape.getArea()}")
}

fun main() {
    val rectangle = Rectangle(5, 10)
    val square = Square(4)

    printArea(rectangle) // Output: 50
    printArea(square)    // Output: 16
}
✅ Now LSP is followed because both Rectangle and Square behave independently without unexpected modifications.
LSP means a subclass should replace its parent without issues.


4. I - Interface Segregation Principle (ISP)
A class should not be forced to implement interfaces it does not use.
Break large interfaces into smaller, more specific ones.

❌ Bad Example (Violating ISP)
interface Worker {
    fun work()
    fun eat()
}

class Robot : Worker {
    override fun work() {
        println("Robot is working")
    }

    override fun eat() {
        throw UnsupportedOperationException("Robots don't eat!")
    }
}
The Robot class is forced to implement eat(), which it does not need.

✅ Good Example (Following ISP)
interface Workable {
    fun work()
}

interface Eatable {
    fun eat()
}

class Human : Workable, Eatable {
    override fun work() {
        println("Human is working")
    }

    override fun eat() {
        println("Human is eating")
    }
}

class Robot : Workable {
    override fun work() {
        println("Robot is working")
    }
}
Now Robot does not need to implement eat(), following ISP.

5. D - Dependency Inversion Principle (DIP)
High-level modules should not depend on low-level modules. Both should depend on abstractions.
Use interfaces instead of direct class dependencies.

❌ Bad Example (Violating DIP)
class MySQLDatabase {
    fun saveData() {
        println("Saving data to MySQL database")
    }
}

class DataManager {
    private val database = MySQLDatabase() // Hardcoded dependency

    fun save() {
        database.saveData()
    }
}
DataManager is tightly coupled with MySQLDatabase, making it hard to switch databases.

✅ Good Example (Following DIP)
interface Database {
    fun saveData()
}

class MySQLDatabase : Database {
    override fun saveData() {
        println("Saving data to MySQL database")
    }
}

class FirebaseDatabase : Database {
    override fun saveData() {
        println("Saving data to Firebase")
    }
}

class DataManager(private val database: Database) {
    fun save() {
        database.saveData()
    }
}
Now, DataManager depends on an interface (Database), so we can easily switch databases.


Final Thoughts
Principle	What It Means	                                Benefit
SRP	        One class = One responsibility                  Easy to maintain
OCP	        Open for extension, closed for modification	    Scalable code
LSP	        Subclasses should behave like parents	        Avoids unexpected behavior
ISP	        Use small, specific interfaces	                No unnecessary methods
DIP	        Depend on abstractions (interfaces)	            Flexible and testable code
Applying SOLID principles in Android development (Kotlin) helps you create scalable, testable,
 and maintainable applications. 🚀
 */


