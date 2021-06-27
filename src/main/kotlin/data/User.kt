package data

class User(var username: String, var password: String){
    init {
        println("constructor user \"$username\" pada class user dibuat. password : \"$password\"")
    }

    // 19. function to string
    // bisa mengubah object dari representasi yg kita buat
    // return toString bisa di ganti menjadi sesuai yg kita inginkan
    override fun toString(): String {
        return "user with username = $username"
    }
}