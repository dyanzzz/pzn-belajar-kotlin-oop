package app

import data.Product

// keterangan data class ada di class product
fun main() {
    val product = Product("Indomie", 2000, "Mie Instan")

    // data class bisa menduplikat data class object lain
    val product2 = product.copy(name="Sarimi")

    println(product)
    println(product2)
}