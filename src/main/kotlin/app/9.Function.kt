package app

import data.Person

fun main() {
    val hello = Person()
    hello.firstName = "ahmad"
    hello.middleName = "kurniawan"
    hello.lastName = "Kane"

    hello.sayHello("budi")
    hello.run()

    val fullName = hello.getFullName()
    println(fullName)
}