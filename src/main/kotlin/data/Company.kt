package data

class Company(val name: String) {

    // mengoverride equals, menjadi membandingkan value namenya
    // jika tidak di override, equals hanya akan membandingkan lokasi object/objectnya saja, ketika dibuat instancenya
    override fun equals(other: Any?): Boolean {
        return when(other){
            is Company -> other.name == this.name
            else -> false
        }
    }

    // mengoverride hashcode
    override fun hashCode(): Int {
        return this.name.hashCode()
    }
}