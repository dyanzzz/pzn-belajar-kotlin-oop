package app

import data.Student

// 49. scope function
fun main() {
    val student = Student("budi", 20)

    // biasanya untuk mengakses object seperti ini
    println(student.name)
    println(student.age)
    println()

    // menggunakan let
    // let function => let function bisa digunakan sebagai reference block agar kita bisa lebih mudah ketika ingin memanipulasi sebuah object
        // let function memiliki parameter object itu sendiri sehingga bisa menggunakan kata kunci it untuk dapat mereferensikan terhadap object tsb
        // digunakan untuk mengakses object lebih cepat dan mudah karena object yg perlu dibuat terlalu banyak
    val result: String = student.let {
        "Name : ${it.name}, Age : ${it.age}"
    }
    println(result)
    println("==== menggunakan let == akan mereturn string == cara mengakses propertiesnya dengan menggunakan it ====")
    println()

    // menggunakan run
    // run function => pada run function tidak ada parameter pada lambdanya. sehingga kita tidak bisa menggunakan kata kunci it.
        // namun masih bisa mengakses reference object dengan this
    val result2: String = student.run {
        "Name : ${this.name}, Age : ${this.age}"
    }
    println(result2)
    println("==== menggunakan run == akan mereturn string == cara mengakses propertiesnya dengan menggunakan this ====")
    println()

    // menggunakan apply
    // apply function => pada apply function return value dari apply function itu adalah reference object itu sendiri
        // menggunakan this untuk mengakses object valuenya
    val result3: Student = student.apply {
        "Name : ${this.name}, Age : ${this.age}"
    }
    println(result3)
    println("==== menggunakan apply == akan mereturn object itu sendiri == cara mengakses propertiesnya dengan menggunakan this ====")
    println()

    // menggunakan also
    // also function => pada also function return value dari also function itu adalah reference object itu sendiri
        // menggunakan it untuk mengakses object valuenya
    val result4: Student = student.also {
        "Name : ${it.name}, Age : ${it.age}"
    }
    println(result4)
    println("==== menggunakan also == akan mereturn object itu sendiri == cara mengakses propertiesnya dengan menggunakan it ====")
    println()

    // with function
    // bukan merupakan bagian extension dari function, tidak bisa digunakan langsung dari object, jadi harus memanggil secara manual
    val result5: String = with(student){
        "Name : ${this.name}, Age : ${this.age}"
    }
    println(result5)
    println("==== menggunakan with(object) == akan mereturn string == cara mengakses propertiesnya dengan menggunakan this ====")
    println()
}