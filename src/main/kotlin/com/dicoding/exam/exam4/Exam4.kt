package com.dicoding.exam.exam4

// TODO
open class Car(val brand: String, val year: Int) {
    open fun getCarInfo(): String {
        return "$brand keluaran tahun $year"

    }
}

// TODO
class ElectricCar(pBrand: String, pYear: Int, val batteryCapacity: Int) : Car(pBrand, pYear) {
    override fun getCarInfo(): String {
        return "$brand keluaran tahun $year dengan kapasitas baterai $batteryCapacity kWh"
    }
}