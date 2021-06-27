package app

import data.Car

fun main() {
    val almaz = Car("Wuling")
    val avanza = Car("Toyota", "Avanza" )


    println("Mobil : ${avanza.brand}, nama : ${avanza.name}, tahun : ${avanza.year}")
    println("Mobil ${almaz.brand} tahun ${avanza.year}")
}