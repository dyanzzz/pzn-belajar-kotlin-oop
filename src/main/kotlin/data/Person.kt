package data

// 2. membuat class person
class Person {

    // 4. membuat properties
        // properties itu sama seperti variable
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""
    var age: Int = 0

    // 9. membuat function
    fun sayHello(name: String) {
        println("Hello $name, my name is ${this.firstName}")
    }

    // 10. function overloading
    // membuat nama function yg sama itu boleh
    // membuat function yg sama, namun parameter/tipe datanya harus berbeda
    fun sayHello(firstName: String, lastName: String) {
        // 11. menggunakan this keyword
        println("Hello $firstName $lastName, my name is ${this.firstName}")
    }

    fun run() {
        println("I'm Run")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }
}