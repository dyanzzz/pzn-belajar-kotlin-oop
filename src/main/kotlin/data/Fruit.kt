package data

data class Fruit(val quantity: Int) {
    // operator disini maksudnya adalah mengoveride function plus agar dapat digunkaan dengan menggunakan operator matematika seperti +
    operator fun plus(fruit: Fruit) : Fruit{
        return Fruit(this.quantity + fruit.quantity)
    }

    operator fun minus(fruit: Fruit): Fruit{
        return Fruit(this.quantity - fruit.quantity)
    }
}