package app

import data.Application

// 37. typealias
// digunakan untuk menandai /membedakan nama properties/function
// sangat berguna ketika ada package yg berbeda, namun classnya sama
// bisa menggunakan typealias untuk membedakannya
fun main() {
    val app = App("budi")
    val aplikasi = Aplikasi("Anto")
    val appV2 = AppV2("ini aplikasi v 2")
    sayHello{ "budi" }
}

typealias App = Application
typealias Aplikasi = App

// ini cara untuk mendefined nama class yg sama di package yg berbeda dengan typealias
typealias AppV2 = data2.Application

// menggunakan typealias untuk menghandle lambda
typealias StringSupplier = () -> String

//sebelumnya
//fun sayHello(supplier: ()->String){
// setelahnya -> tinggal panggil typealiasnya aja
fun sayHello(supplier: StringSupplier){
    println("hello ${supplier()}")
}