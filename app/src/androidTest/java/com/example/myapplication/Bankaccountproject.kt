package com.example.myapplication
// BANK ACCOUNT PROJECT 3

fun main() {
    println("Welcome to your banking system.")
    println("What type of account would you like to create?")
    println("1.Debit account")
    println("2.Credit account")
    println("3.Checking account")
    var accountType: String = ""
    var userChoice = 0
    while (accountType == "") {
        println("Choose an option(1,2 or 3)")
        userChoice = (1..5).random()
        println("The selected option is $userChoice.")

        when (userChoice) {
            1 -> accountType = "debit"
            2 -> accountType = "credit"
            3 -> accountType = "checking"
            else -> continue
        }

    }
    println("You have created a $accountType account.")

    var accountBalance = (0..100).random()
    println("Account balance: $accountBalance dollars")

    val money = (0..100).random()
    println("The amount you transferred is: $money dollars")

    fun withdraw(amount: Int): Int {
        accountBalance -= amount
//        println("Withdrawn: $amount dollars")
        println("You successfully withdrew $amount dollars. the current balance is $accountBalance dollars. ")
        return amount
    }

    fun debitWithdraw(amount: Int): Int {
        if (accountBalance == 0) {
            println("Can't withdraw, no money on this account!")
            return accountBalance
        } else if (amount > accountBalance) {
            println("Not enough money on this account! The current balance is $accountBalance dollars.")
            return 0
        } else {
            return withdraw(amount)
        }
    }

    fun deposit(amount: Int): Int {
        accountBalance += amount
        println("Deposited: $amount dollars")
        println("Updated balance: $accountBalance dollars")
        return amount
    }

    fun creditDeposit(amount: Int): Int {
        if (accountBalance == 0) {
            println("No need to deposit since the account is already paid off.")
            return accountBalance
        } else if (accountBalance + amount > 0) {
            println("Deposit failed, you tried to pay off an amount greater than the credit balance. The checking balance is $accountBalance dollars.")
            return 0
        } else if ( amount == -accountBalance) {
            accountBalance = 0
            println("You deposited just enough money to completely pay off the account.")
            return amount
        } else {
            return deposit(amount)
        }
    }

    fun transfer(mode: String) {
        val transferAmount: Int

        when (mode) {
            "withdraw" -> {
                if (accountType == "debit") {
                    transferAmount = debitWithdraw(money)
                } else {
                   transferAmount =  withdraw(money)
                }
                println("The amount you withdrew is ${transferAmount} dollars.")
            }

            "deposit" -> {
                 if (accountType == "credit") {
                   transferAmount =  creditDeposit(money)
                } else {
                    transferAmount = deposit(money)
                }
                println("the amount you deposited is ${transferAmount} dollars.")
            }
            else -> return
        }
    }

    var isSystemOpen = true
    var option = 0

    while (isSystemOpen == true) {
        println("What would you like to do?")
        println("1.Check bank account balance")
        println("2.Withdraw money")
        println("3.Deposit money")
        println("4.Close the app")
        println("Which option do you choose?(1,2,3 or 4)")

        option = (1..5).random()
        println("The selected option is:$option.")

        when (option) {
            1 -> println("The balance of the bank account is $accountBalance dollars.")
            2 -> transfer("withdraw")
            3 -> transfer("deposit")
            4 -> {
                isSystemOpen = false
                println("The aap interface is now closed.")
            }
            else -> continue
        }

    }


}
