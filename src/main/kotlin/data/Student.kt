package data

// menggunakan nullable exception menggunakan ? setelah type data
class Student(val name: String, val age: Int?)

fun Student?.sayHello(name: String){
    println("Hello $name, my name is ${this?.name}, and my age is ${this?.age}")
}

// 29. Extention properties
// untuk membuat extention properties, harus menambahkan getter dan setternya juga
val Student.upperName : String
    get() = this.name.uppercase()