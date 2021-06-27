package app

import data.Application
import data.ApplicationUtilities
import data.Utilities

// 35. singleton object
// object yg hanya 1 1nya didalam lifecycle aplikasi
// singleton object tidak punya constructor
// biasanya digunakan untuk buat helper/utility class
fun main() {
    println(Utilities.name)
    //Utilities.name = "diubah"
    println(Utilities.toUpper("Budi"))
    a()
    b()

    println(ApplicationUtilities.Utilities.toUpper("budi"))

    // cara manggil companion object
    // nama classnya.langsung function/propertiesnya
    println(Application.toUpper("Bos"))
}

fun a() {
    println(Utilities.name)
}

fun b() {
    println(Utilities.name)
}