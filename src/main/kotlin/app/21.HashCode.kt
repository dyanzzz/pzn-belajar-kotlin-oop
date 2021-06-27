package app

import data.Company

fun main() {
    val company1 = Company("HYD")
    val company2 = Company("HYD")

    // compare object company ketika di convert ke hashcode/number
    println(company1.hashCode() == company2.hashCode())
    println(company1.hashCode())
    println(company2.hashCode())
}