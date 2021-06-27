package app

import data.Cat
import data.Dog

fun main() {
    val cat = Cat()
    cat.run()
    cat.name

    val dog = Dog()
    dog.run()
    dog.name
}