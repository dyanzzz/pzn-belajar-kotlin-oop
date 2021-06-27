package data

// 24. membuat getter setter di kotlin sebernarnya tidak diperlukan, karena sudah dihandle oleh kotlin secara otomatis
// tapi jika kita ingin custom menambahkan validasi/ custom function getter & setternya, bisa disesuaikan saja
class Note(title: String) {
    var title: String = title
        get() {
            println("call getter function")
            return field
        }
        set(value) {
            println("call setter function")
            if (value.isNotBlank()) field = value
        }
}

class BigNote(val title: String) {
    val bigTitle: String
        get() = title.uppercase()
}