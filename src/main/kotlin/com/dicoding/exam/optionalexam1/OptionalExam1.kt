package com.dicoding.exam.optionalexam1

// TODO
fun sumOfBigThree(vararg numbers: Int): Int {
    numbers.sortDescending()
    val tigaTerakhir = numbers.take(3)
    val total = tigaTerakhir.sum()

    return total
}
