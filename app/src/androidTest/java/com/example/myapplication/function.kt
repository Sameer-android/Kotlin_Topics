package com.example.myapplication

// EXERCISE PRACTICE HANDLING NULLABILITYA

/*data class Student(val fullName: String, val id:Int, var grade:Double)

val students= listOf<Student>(
    Student("John",223,140.0),
    Student("Mark",548,120.0),
    Student("Natali",342,150.0),
    Student("Sara",781,130.0)

)

fun getStudentById(id:Int):Student{
    return students.find { it.id==id }!!

}
fun searchInStudents(name: String):Student?{
    return students.find { it.fullName.lowercase()==name.lowercase() }
}


fun main() {
    println("Please,Enter the Student's ID")
    val id = readln().toInt()
    println(getStudentById(id))
    println("Please,Enter the student's name")
    val name = readln()
    println(searchInStudents(name)?:"the student is not found")

}*/

fun main() {
    // Step 1
    var accountBalance = (0..100).random()
    println("Account balance: $accountBalance dollars")

    val money = (0..100).random()
    println("Amount to be deposited/withdrawn: $money dollars")

    // Step 2
    var output = 0

    // Step 3
    fun withdraw(amount: Int): Int {
        accountBalance -= amount
        println("Withdrawn: $amount dollars")
        println("Updated balance: $accountBalance dollars")
        return amount
    }

    // Step 4
    output = withdraw(money)
    println("Output of withdraw function: $output")

    // Step 5
    fun debitWithdraw(amount: Int): Int {
        if (accountBalance == 0) {
            println("Can't withdraw, no money on this account!")
            return accountBalance
        } else if (amount > accountBalance) {
            println("Not enough money on this account! The checking balance is $accountBalance dollars.")
            return 0
        } else {
            return withdraw(amount)
        }
    }

    // Step 6
    output = debitWithdraw(money)
    println("Output of debitWithdraw function: $output")

    // Step 7
    fun deposit(amount: Int): Int {
        accountBalance += amount
        println("Deposited: $amount dollars")
        println("Updated balance: $accountBalance dollars")
        return amount
    }

    // Step 8
    output = deposit(money)
    println("Output of deposit function: $output")

    // Step 9
    fun creditDeposit(amount: Int): Int {
        if (accountBalance == 0) {
            println("No need to deposit since the account is already paid off.")
            return accountBalance
        } else if (accountBalance + amount > 0) {
            println("Deposit failed, you tried to pay off an amount greater than the credit balance. The checking balance is $accountBalance dollars.")
            return 0
        } else if (accountBalance + amount == 0) {
            println("You deposited just enough money to completely pay off the account.")
            return amount
        } else {
            return deposit(amount)
        }
    }
    
    // Step 10
    output = creditDeposit(money)
    println("Output of creditDeposit function: $output")
}
