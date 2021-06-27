package data

// 23. Abstract Class, properties dan function
abstract class Animal {
    // membuat abstract untuk properties dan function
    abstract val name: String
    abstract fun run()
}

// implementasi abstract properties dan function tidak bisa di define di parent class
// child class yang harus mendefine value properties dan function yg sudah di implement di child class tersebut
class Cat: Animal() {
    override val name: String = "Cat"

    override fun run() {
        println("Cat run")
    }
}

class Dog: Animal() {
    override val name: String = "Dog"

    override fun run() {
        println("Dog run")
    }
}