package app

import data.Address

fun main() {
    val address = Address("Jalan A", "Jakarta")
    val address2 = Address("Jalan B", "Serang", "Indonesia")

    println(address.street)
    println(address.country)
}