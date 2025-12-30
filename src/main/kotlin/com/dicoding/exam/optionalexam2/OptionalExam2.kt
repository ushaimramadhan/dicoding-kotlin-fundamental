package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val str = kotlin.math.abs(number).toString()
    require(str.length in 2..9) { "Panjang digit harus 2 sampai 9"}

    val digits = str.map { it - '0' }

    val minDigit = digits.minOrNull()!!
    val maxDigit = digits.maxOrNull()!!
    return minDigit + maxDigit
}
