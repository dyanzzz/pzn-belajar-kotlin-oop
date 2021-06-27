package data

// abstract class
// parent class yg sudah diberikan keyword abstract
// akan langsung menjadi parent class, bagi class lain yg mengextendsnya
// dan parent class ini tidak bisa di declare langsung/ dibuat objectnya langsung
// jadi harus menggunakan child classnya untuk bisa menggunakan abstrac/parent classnya
abstract class Location(val name: String){

    // membuat properties & function abstract
    // syaratnya, classnya harus abstract lebih dulu/ didalam class abstract

}

class City(name: String): Location(name)

class Country(name: String): Location(name)