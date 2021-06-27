package app

import program.MyApplication

// 46. anotation
// menambahkan metadata/ informasi tambahan ke kode program yg kita buat
// tidak semua orang membutuhkan anotation, biasanya digunakan saat kita ingin membuat library/framework
// anotation bisa diakses menggunakan refleksion. refleksion == mengambil informasi pada saat aplikasi berjalan
// anotation hanya boleh memiliki properties via primary constructor. tidak boleh memiliki member lain(function / properties di body).
fun main() {
    val myApplication = MyApplication("budi", 2)
    println(myApplication.info())
}