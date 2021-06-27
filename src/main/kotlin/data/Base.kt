package data

interface Base {
    fun sayHello(name: String)
    fun sayGoodbye(name: String)
}

class MyBase: Base{
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayGoodbye(name: String) {
        println("Goog By $name")
    }
}

// membuat class delegation pattern
// delegate == perwakilan
    // delegate dari class Base yg terhubung langsung oleh interface dan mengimplementasikannya

/*class MyBaseDelegate(val base: Base): Base {
    override fun sayHello(name: String) {
        base.sayHello(name)
    }

    override fun sayGoodbye(name: String) {
        base.sayGoodbye(name)
    }
}*/

// secara explisit, di kotlin, membuatnya menjadi sangat mudah, yaitu tanpa perlu mengimplementasikan function yg di implementasikan oleh basenya
// keywordya menggunakan "by base/property basenya"
class MyBaseDelegate(val base: Base): Base by base

class MyBaseDelegate2(val base: Base): Base by base {
    // jika ingin mengupdate function pada basenya, gunakan keyword override pada function yang ingin di update
    override fun sayHello(name: String) {
        println("hi $name")
    }
}
