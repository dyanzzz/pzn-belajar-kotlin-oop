package app

import data.Fruit

fun main() {
    // 43. operator overloading
    // membuat function dari operator" matematika dan operator lain
    val fruit1 = Fruit(100)
    val fruit2 = Fruit(200)
    val result = fruit1 + fruit2

    println(result)
    println(fruit1 - Fruit(20))
}