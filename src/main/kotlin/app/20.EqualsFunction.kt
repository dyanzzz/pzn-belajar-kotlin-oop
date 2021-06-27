package app

import data.Company

fun main() {
    val company1 = Company("HYD")
    val company2 = Company("HYD")

    // compare object company dengan equals function
    // secara default == dengan .equals itu sama saja di kotlin
    println(company1 == company2)
}