package data

enum class Gender (val description: String) {
    MALE("Laki-laki"),
    FEMALE("Perempuan");

    fun showDescription(){
        println(description)
    }
}