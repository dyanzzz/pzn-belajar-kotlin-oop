package data

open class Shape {
    open val corner: Int = -1

    open fun printName() {
        println("This is shape")
    }
}

class Rectangle: Shape() {
    override val corner: Int = 3
    val parentCorner: Int = super.corner

    override fun printName() {
        println("this is rectangle")
        // 15 super ini berguna untuk mengakses function yg ada di parentnya
        super.printName()
    }
}

class Triangle: Shape() {
    override val corner: Int = 4
}