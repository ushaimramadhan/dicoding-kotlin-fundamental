package com.dicoding.exam.optionalexam4

fun getMiddleCharacters(string: String): String {
    require(string.length in 1..100) { "string must contain 1-100 characters" }

    val len = string.length
    val mid = len / 2

    return if (len % 2 == 0) {
        string.substring(mid - 1, mid + 1)
    } else {
        string[mid].toString()
    }
}
