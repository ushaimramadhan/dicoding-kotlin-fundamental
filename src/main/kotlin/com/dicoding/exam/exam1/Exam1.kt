package com.dicoding.exam.exam1

// TODO 1
fun isEvenNumber(number: Int): Boolean {
    if (number % 2 == 0) {
        return true
    } else {
        return false
    }
}

// TODO 2
fun moreThanFive(number: Int): Boolean {
    if (number > 5) {
        return true
    } else {
        return false
    }
}

// TODO 3
fun result(number: Int): Int {
    val result = number * (number + 10)
    return result
}