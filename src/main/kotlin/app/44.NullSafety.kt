package app

fun main() {
    // 44. null safety
    // menggunkana tanda ? untuk menjadikan variable/ operator/ function mengizinkan null jika data yg didapat adalah null
    // menggunakan operator !!, untuk memaksa  operator menjadi nullable, yg sebelumnya tidak nullable
        // konsekuensinya akan error NullPointerException juga ternyata propertynya adalah null
    sayHello(Friend("Budi"))
    sayHello(null)
}

data class Friend(val name: String)

fun sayHello(friend: Friend?){
    if(friend != null) {
        println()
        println("null tidak muncul disini, karena sudah di block opeh kondisi != null")
        println("Hello ${friend.name}")
    }

    // bisa juga menggunakan null safety pada kotlin
    // tapi akan tetap akan ter print menjadi null
    println()
    println("null akan muncul disini. jika variable operator = null")
    println("Hello ${friend?.name}")    // null akan tetap tercetak

    // cara untuk menangani agar null tidak ter print, gunakan elvis operator
    val name = friend?.name ?: ""   // elvis operator
    println()
    println("null tidak akan muncul disini, karena sudah dihandle oleh elvis operator/ternary")
    println("Hello $name")

    println()
    // jika property null, akan membuat NullPointerException
    // hati" menggunkan tanda seru 2x
    //val nameAvailableNull = friend!!.name // error jika property adalah null
    //println(nameAvailableNull)
    println("======================================")
}

// 46. exception
//