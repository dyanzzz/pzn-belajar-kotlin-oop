package data

// untuk menggunakannya tinggal panggil singleton objectnya.membernya (properties/function)
object Utilities {
    const val name: String = "My utilities"

    fun toUpper(value: String): String {
        return value.uppercase()
    }
}

// singleton object bisa dibuat didalam class, menjadi inner class
// namung tidak dapat mengakses properties/function yg ada di outer classnya
class ApplicationUtilities(val name: String) {

    object Utilities {
        fun toUpper(name: String): String {
            return name.uppercase()
        }
    }
}