package data

// 5. constructor
// class memiliki constructor yg dijalankan ketika instance dibuat
// bisa juga diberikan default value
class Car (paramBrand: String, paramName: String?, paramYear: Int = 2020){

    // 6. initializer block
    // dipanggil ketika pertama kali clas di buat
    // dipanggil bersamaan ketika constructor dibuat
    init {
        println("Car $paramBrand dibuat")
    }

    // 7. secondary constructor
    // secondary constructor bisa lebih dari 1
    constructor(paramBrand: String, paramName: String): this(paramBrand, paramName, 2020){
        println("- Secondary constructor 1 \"$paramBrand\"")
        println("- Secondary constructor 1 \"$paramName\"")
        println("- Secondary constructor 1 year \"${this.year}\"")
    }

    constructor(paramBrand: String): this(paramBrand, ""){
        println("- Secondary constructor 2 \"$paramBrand\"")
        println("- Secondary constructor 2 year \"${this.year}\"")
    }

    var brand: String = paramBrand
    var name: String? = paramName
    var year: Int? = paramYear
}