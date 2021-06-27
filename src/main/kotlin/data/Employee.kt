package data
// 12 inheritance
// untuk membuat parent class dalam inheritance, menggunakan keyword open
open class Employee(val name: String, val jabatan: String) {
    // 13. function overriding
    // untuk membuat function overriding, menggunakan keyword open pada function yg ingin di handle oleh class lain
    open fun sayHello(name: String) {
        println("Hello $name. My name is ${this.name} and i'm your ${this.jabatan}")
    }
}

// untuk menerapkan parent class ke child classnya menggunakan extends kalo di java, kalo di kotlin ": parent classnya"
// menambahkan keyword open agar class tsb bisa di override oleh class turunannya/childnya
open class Manager(name: String): Employee(name, "Manager") {
    // membuat function overriding
    // keyword yg harus digunakan adalah override
    // menambahkan keyword final agar function ini tidak dapat di akses oleh class turunannya/childnya
    final override fun sayHello(name: String) {
        println("Hello $name, My name is Manager ${this.name}")
    }
}

class SuperManager(name: String): Manager(name) {
    // jika ingin mengoverride function yang ada di parentnya, sedangkan parentnya merupakan child dari parentnya juga,
        // maka harus menghilangkan final pada function di class parentnya
    // ERROR
    /*
    override fun sayHello(name: String) {
        super.sayHello(name)
    }
    */
}

class VicePresident(name: String): Employee(name, "Vice President")