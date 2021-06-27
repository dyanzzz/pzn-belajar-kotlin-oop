package app

import data.User

fun main() {
    val user = User("budi", "rahasia")
    val user2 = User("anto", "blok")

    user.username = "ahmad"

    println(user.username)
    println(user.password)
}