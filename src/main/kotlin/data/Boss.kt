package data

// inner class
// secara default, masing-masing class inner ataupun outer class tidak bisa saling berinteraksi/ mendapatkan data
// caranya dengan menambahkan inner pada inner/class yg ada di dalam class
// jika class inner/ class yang didalam tsb dibuat innernya, maka tidak dapat langsung dibuat object
// untuk membuat / mengakses inner classnya, harus dibuat object class utama/outter classnya dulu, baru inner classnya
class Boss(val bossName: String) {

    inner class Employee(val name: String){
        fun hi(){
            println("My name is $name, my boss name is ${this@Boss.bossName}")
        }
    }
}