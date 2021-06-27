package app

import data.Boss

// untuk membuat / mengakses inner classnya, harus dibuat object class utama/outter classnya dulu, baru inner classnya
fun main() {
    // outer class
    val bos = Boss("budi")

    // membuat outer class
    val employee = bos.Employee("Eko")

    employee.hi()
}