package app

import data.Television

fun main() {
    val tv = Television()
    tv.initTelevision("Samsung")
    tv.brand = "LG"
    println(tv.brand)
}