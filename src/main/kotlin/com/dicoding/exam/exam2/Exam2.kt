package com.dicoding.exam.exam2

// TODO 1
fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    val finalValueC = valueC ?: 50
    val result = valueA + valueB - finalValueC
    return result
}

// TODO 2
fun result(result: Int): String {
    result.toString()
    return "Result is $result"
}