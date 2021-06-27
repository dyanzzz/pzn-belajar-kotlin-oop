package app

import data.Gender

// 34. Enum Class
// enum class di implementasi untuk data yg sudah tetap
// menggunkaan keyword enum
// enum == constant
fun main() {
    val male = Gender.MALE
    val woman = Gender.FEMALE

    // untuk convert to array
    val allGenders: Array<Gender> = Gender.values()

    // bisa juga dipanggil begini
    val manFromString = Gender.valueOf("MALE")
    val womanFromString = Gender.valueOf("FEMALE")

    println(male)
    println(woman)
    println(allGenders.toList())

    println(manFromString)
    println(womanFromString)

    male.showDescription()
    woman.showDescription()
}