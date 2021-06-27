package data

// 26. interface
// merupakan blueprint/cetakan untuk class
// berbeda dengan class. interface tidak bisa langsung dibuat sebagai object seperti sebuah parent dlm inheritance
// interface hanya bisa diturunkan, biasanya digunakan sbagai kontrak untuk class turunannya
    // jadi kalo mau buat class turunandari interface, maka mengharuskan kita mendeklarasikan semua kontrak didalam interfacenya
    // apa yg di defined di interface, harus juga di defined di class turunannya
// secara standar semua properties & function di interface adalah abstract
interface Interaction {
    val name: String
    // deklarasi kongkret function
    // bisa mendefine body function pada interface
    // cuman, jika sudah mendefine function pada interfacenya, pada class childnya, bisa di override, bisa juga engga
    fun sayHello(name: String)
}

// interface bisa menginherit interface lain
// namun interface tidak bisa memiliki super class lain, hanya bisa memiliki super interface lain
interface Go: Interaction {
    fun go(){
        println("go!!!")
    }
}

interface MoveA {
    fun move(){
        println("move A")
    }
}

interface MoveB {
    fun move(){
        println("move B")
    }
}

// 1 class child bisa memiliki 2 parent interface
// tapi berbeda dengan parent class
// 1 class child tidak bisa mempunya 2 parent class, hanya bisa 1 class parent
// dan didalam class child yg memiliki parent interface, bisa juga digabung dengan parent class
//
class Human(override val name: String): Go, MoveA, MoveB{
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

    // class child bisa memanggil super interfacenya dengan keyword super
    // namun jika memiliki nama function yg sama function harus dioverride dulu
    // kemudian ditambahkan initialize didalam tag <namaInterface> super ketika ingin dipanggil
    // jika tidak ada nama function yg sama, tidak perlu tag nama class tsb
    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
        println("Move human")
    }
}