package app

import data.Student
import data.sayHello
import data.upperName

// 28. extension function
// extension function bukan sebuat function didalam sebuah class/ interface
// saat membuat extension function kita tidak memodifikasi class aslinya
// extension function merupakan function bantuan, yg kita tidak dapat mengakses data private / protected di class tsb
fun main() {
    val student: Student = Student("Budi", null)
    student.sayHello("eko")
    println(student.upperName)
}