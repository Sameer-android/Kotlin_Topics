package com.example.myapplication
//MAP AND SET AND LIST EXERCISE

//class Comment(
//    val userId: Int,
//    val message: String
//
//)
//
//
//fun main() {
//    val comments: List<Comment> = listOf(
//        Comment(5241, "Nice code"),
//        Comment(6624, "Like it"),
//        Comment(5224, "What's going on"),
//        Comment(9001, "Check out my website"),
//        Comment(8818, "Hello everyone:)")
//    )
//
//    val blockedUserIds: Set<Int> = setOf(5224, 9001)
//
//    val userIdToRelation: Map<Int, String> = mapOf(
//        5241 to "friend",
//        6624 to "close friend"
//    )
//
//    for (comment in comments) {
//        if (comment.userId !in blockedUserIds) {
//            val relation = userIdToRelation[comment.userId] ?: "unknown"
//            println("Comment ${comment.message} from $relation")
//        }
//    }
//}


// BANK ACCOUNT PROJECT
//fun main() {
//    println("Welcome to your banking system.")
//    println()
//    println("What type of account would you like to create?")
//    println()
//    println("1.Debit account")
//    println("2.Credit account")
//    println("3.Checking account")
//    println("Choose an option(1,2 or 3)")
//
//    var accountType:String = ""
//    var userChoice = 0
//
//
//    while(accountType==""){
//        userChoice= (1..5).random()
//        println("The selected option is $userChoice")
//
//
//        when(userChoice){
//            1 -> {
//                accountType = "Debit "
//            }
//            2 -> {
//                accountType = "Credit "
//            }
//            3 -> {
//                accountType = "Checking "
//            }
//            else -> {
//                println("Invalid option please choose again.")
//                continue
//            }
//        }
//    }
//    println("You have created a $accountType account")
//
//
//}
//
