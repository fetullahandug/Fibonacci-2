package com.example.coding_challenge_fibonacci_2

fun main() {
    val folge = fibonacci(10)
    println(folge)
}

fun fibonacci(n: Int): List<Int> {
    var fibonacci_list: MutableList<Int> = mutableListOf(0,1)

    for(i in 0..n-3) {
        fibonacci_list.add(fibonacci_list[i] + fibonacci_list[i+1])
    }

    return fibonacci_list
}