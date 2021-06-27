package data2

class Application(val name: String) {

    // 36. membuat companion object
    // cocok banget bikin singleton object yg namanya sama dengan sebuah class
    // caranya : menambahkan keyword companion object tanpa harus memberikan nama pada singleton objectnya
    companion object{
        fun toUpper(name: String): String{
            return name.uppercase()
        }
    }
}