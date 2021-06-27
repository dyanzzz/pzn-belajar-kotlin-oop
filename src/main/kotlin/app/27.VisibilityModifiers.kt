package app

import data.SuperTeacher
import data.Teacher

// 27. visibility modifiers
// class, interface, constructor, function, properties(termasuk getter setter bisa memiliki visibility modifiers
// ada 4 visibility modifiers : public, private, protected, internal
    // public : bisa diakses dari mana saja
    // private : hanya bisa diakses di tempat deklarasi/ di 1 class itu aja
    // protected : hanya bisa diakses di tempat deklarasi/ di 1 class itu aja dan juga turunannya
    // internal : hanya bisa diakses di modul/project yg sama
// standardnya visibility modifiers adalah public
fun main() {
    val teacher = SuperTeacher("Budi")
    //teacher.teach() // errorprivate visibility modifier
    teacher.test()
}