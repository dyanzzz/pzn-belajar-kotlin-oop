package app

import data.MyBase
import data.MyBaseDelegate
import data.MyBaseDelegate2

// delegation
// meneruskan properties/function ke object lainnya
// medelegasikan
// kotlin mendukung delegasi tanpa harus membuat object secara manual
// delegasi == utusan/perwakilan
fun main() {
    val base = MyBase()
    base.sayHello("Budi")

    val myBaseDelegate = MyBaseDelegate(base)
    myBaseDelegate.sayHello("Budi")
    myBaseDelegate.sayGoodbye("Eko")

    val myBaseDelegate2 = MyBaseDelegate2(base)
    myBaseDelegate2.sayHello("bro")
}