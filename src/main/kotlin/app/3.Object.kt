package app

import data.Person

fun main() {
    // 3. membuat object person
    val budi = Person()

    // mendeklarasikan properties kedalam object
    budi.firstName = "Budi"
    budi.middleName = "Anto"
    budi.lastName = "Tri"
    budi.age = 10
    println("instance person : $budi")
}
