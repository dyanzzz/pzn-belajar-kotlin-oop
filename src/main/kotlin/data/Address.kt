package data

class Address {

    // membuat secondary constructor tanpa primary constructor
    constructor(paramStreet: String, paramCity: String) {
        println("secondary constructor tanpa primary constructor $paramStreet dibuat")
        street = paramStreet
        city = paramCity
    }

    constructor(paramStreet: String, paramCity: String, paramCountry: String): this(paramStreet, paramCity) {
        country = paramCountry
    }

    var street: String = ""
    var city: String = ""
    var country: String? = "Indonesia"
}