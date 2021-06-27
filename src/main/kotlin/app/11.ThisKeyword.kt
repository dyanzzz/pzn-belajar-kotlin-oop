package app

import data.Person

fun main() {
    val hello = Person()
    hello.firstName = "budi"
    hello.lastName = "nugraha"

    hello.sayHello("anto", "ucup")
}