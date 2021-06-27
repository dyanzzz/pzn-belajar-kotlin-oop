package app

import data.HandPhone
import data.Laptop

fun main() {
    printObjectWithWhen("Budi")
    printObjectWithWhen(30)
    printObjectWithWhen(true)
    printObjectWithWhen(Laptop("Acer"))
    printObjectWithWhen(HandPhone("Samsung"))

    printString("Budi")
    // printString(2)   // Error ErrorCastException

    printStringSafe("budd budd")
    printStringSafe(3)
}

fun printObject(any: Any) {
    // menggunakan if
    if (any is Laptop) {
        println("Laptop : ${any.name}")
    } else if (any is HandPhone) {
        println("Handphone : ${any.name}")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {
    // menggunakan when
    when (any) {
        is Laptop -> println("Laptop : ${any.name}")
        is HandPhone -> {
            println("Handphone : ${any.name}")
        }
        else -> {
            println(any)
        }
    }
}

// casting/konversi yang tidak aman
fun printString(any: Any) {
    val value = any as String
    println("printString casting : $value")
}

// casting/konversi variable yg aman / safe nullable cast
// menggunakan any?
// efek sampingnya ketika gagal melakukan casting, akan mengubah value menjadi null
fun printStringSafe(any: Any) {
    val value: String? = any as? String
    println("safe print string casting : $value")
}