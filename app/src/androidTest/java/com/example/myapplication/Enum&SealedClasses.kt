package com.example.myapplication

/*fun main(){
    val day = Day.MONDAY
    for (i in Day.values()){
        println(i)
    }

    day.printFormattedDay()
}

enum class Day{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    STATURDAY;

    fun printFormattedDay(){
        println("Day is $this")
    }
}*/



/*
// Sealed Class Ka Simple Example
sealed class Result {
    class Success(val data: String) : Result()
    class Error(val message: String) : Result()
    object Loading : Result()
}

fun handleResponse(response: Result) {
    when (response) {
        is Result.Success -> println("Data: ${response.data}")
        is Result.Error -> println("Error: ${response.message}")
        is Result.Loading -> println("Loading...")
    }
}

fun main() {
    val success = Result.Success("API Data")
    val error = Result.Error("Network Issue")
    val loading = Result.Loading

    handleResponse(success)  // Output: Data: API Data
    handleResponse(error)    // Output: Error: Network Issue
    handleResponse(loading)  // Output: Loading...
}*/
