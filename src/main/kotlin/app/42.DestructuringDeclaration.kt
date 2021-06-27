package app

import data.Game
import data.GameOfThrones
import data.Login
import data.MinMax

fun main() {
    val game = Game("Game", 2000)

    // biasanya
    /*val name = game.name
    val price = game.price*/

    // dengan adanya destructuring declaration, bisa dilakukan seperti ini
    val (name, price) = game

    println(name)
    println(price)

    val gameOfThrones = GameOfThrones("Game of Thrones", 2000_000)
    val (gameName, gamePrice) = gameOfThrones
    println(gameName)
    println(gamePrice)

    // biasanya untuk declare variable seperti ini
    /*val result = minMax(10, 100)
    val min = result.min
    val max = result.max*/

    // namum dengan destructing declaration
    // bisa dilakukan seperti ini
    // _ (underscore) disini artinya tidak digunakan
    val (min, _) = minMax(10, 100)
    println(min)
    //println(max)

    val login = Login("budi", "rahasia")

    // implementasi destructing declaration pada lambda biasanya seperti ini
    /*login(login){ login ->
        login.user == "budi" && login.password == "rahasia"
    }*/

    // menjadi seperti ini
    // jadi bisa melakukan destructuring pada lambda juga
    login(login){ (user, password) ->
        user == "budi" && password == "rahasia"
    }

}

fun minMax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value2)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean) : Boolean {
    return callback(login)
}
