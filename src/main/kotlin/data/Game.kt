package data

class Game(val name: String, val price: Int) {
    // membuat component desctructuring declaration
    operator fun component1(): String = name
    operator fun component2(): Int = price
}

//tapi di kotlin, dibuat sangat sederhana dengan data class, tanpa harus mengimplementasikan function componentnya
// karena sudah di handle oleh data class pada kotlin
data class GameOfThrones(val name: String, val price: Int)

data class MinMax(val min: Int, val max: Int)

data class Login(val user: String, val password: String)