package app

import data.Human

// keterangan interface ada di class interaction
fun main() {
    val human = Human("Budi")
    human.sayHello("Eko")
    human.go()
    human.move()
}