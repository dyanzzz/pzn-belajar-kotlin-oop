package app

import data.Employee
import data.Manager
import data.VicePresident

// 50. polimorphism
// dalam bahasa yunani artinya banyak bentuk
// dalam oop artinya merupakan sebuah object yg dapat berubah bentuk menjadi bentuk object lain
// pholimorphism erat hubungannya dengan inheritance
// apalagi pada bahasa pemrogramman java & kotlin yang merupakan static language
fun main() {
    var employee = Employee("Budi", "staff")
    employee.sayHello("eko")

    employee = Manager("Eko")
    employee.sayHello("budi")

    employee = VicePresident("Anto")
    employee.sayHello("eko")
}