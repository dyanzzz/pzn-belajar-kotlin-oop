package app

import data.SmartPhone

fun main() {
    val smartPhone = SmartPhone("Samsung S10", "Android")

    // toString itu turunan dari class Any
    println(smartPhone.toString())
}