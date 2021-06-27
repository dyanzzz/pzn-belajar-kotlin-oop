package data

import java.util.*
import kotlin.properties.Delegates

// lazy properties
// digunkana untuk mendelegasi properties
// merupakan standar libarary  yg telah disediakan agar properties baru diinisialisasi ketika properties itu diakses
class Account(description: String = "") {
    val name: String by lazy {
        println("name is called")
        "Budi"
    }

    // 41. observable properties
    // untuk mendeteksi perubahan terhadap sebuah properties, menggunakan delegation properties
    var description : String by Delegates.observable(description){
        property, oldValue, newValue ->
        println("${property.name} is change from $oldValue to $newValue")
    }
}