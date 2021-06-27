package data

// 30. data class dibuat dengan menambahkan keyword data di depan classs
// ketika membuat data class, harus memiliki parameter
// kotlin dengan pintarnya langsung membuat semua kebutuhan yg diperlukan oleh class
    // dari toString, equals, hashCode, getterSetter, dll
    // jadi setelah dibuat menjadi data class, data yg dikeluarkan lebih mudah untuk diolah kembali, karena dalam bentuk object yg mudah di kelola
data class Product(
    val name: String,
    val price: Int,
    val category: String) {
}