package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("budi")
    val viceManager = VicePresident("joko")

    manager.sayHello("anto")
    viceManager.sayHello("tri")
}