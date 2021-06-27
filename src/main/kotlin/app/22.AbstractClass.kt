package app

import data.City
import data.Country

fun main() {
    val city = City("Serang")
    val country = Country("Kragilan")

    println(city.name)
    println(country.name)
}