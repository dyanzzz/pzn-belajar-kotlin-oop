package program

import anotation.Fancy

@Fancy(author = "Budi")
class MyApplication(val name:String, val version: Int) {
    fun info(): String {
        return "Application $name-$version"
    }
}