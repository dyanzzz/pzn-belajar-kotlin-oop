package data

// 16. membuat super constructor
open class Customer(val name: String, val type: String, val balance: Long) {
    constructor(name: String, type: String): this(name, type, 0)
    constructor(name: String): this(name, "Standard")
}

// sample jika membuat class tanpa constructor, maka extendnya juga tidak perlu parameter
// tambahakan parameter pada constructor secondary constructornya
class PremiumCustomer : Customer {
    constructor(name: String) : super(name, "Premium")
    constructor(name: String, balance: Long) : super(name, "Premium", balance)
}

class ExecutiveCustomer(name: String, balance: Long) : Customer(name, "Executive", balance) {
    constructor(name: String) : this(name, 0)
}