package app

import data.Rectangle
import data.Shape
import data.Triangle

fun main() {
    val shape = Shape()
    shape.printName()
    println(shape.corner)

    val rectangle = Rectangle()
    println(rectangle.corner)

    // 15. mengakses super keyword
    println(rectangle.parentCorner)

    rectangle.printName()

    val triangle = Triangle()
    println(triangle.corner)
}