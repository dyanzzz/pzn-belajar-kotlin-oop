package data

// inline class
// sangat berguna untuk menghemat memori yg dimiliki
inline class Token(val value: String){
    fun toUpper(): String = value.uppercase()
}