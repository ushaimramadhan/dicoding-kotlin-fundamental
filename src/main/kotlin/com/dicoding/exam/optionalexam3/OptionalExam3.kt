package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    require(int in 1..100) { "int must be in 1..100" }

    val regex = "\\d+".toRegex()
    val match = regex.find(str)

    return if (match != null) {
        val numberPart = match.value.toInt()
        val multiplied = numberPart * int
        val textPart = str.substring(0, match.range.first)
        textPart + multiplied
    } else {
        str + int
    }
}
