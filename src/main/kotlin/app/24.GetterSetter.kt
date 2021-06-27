package app

import data.BigNote
import data.Note

fun main() {
    val note = Note("Belajar kotlin")
    println(note.title)
    note.title = "belajar bos"
    println(note.title)

    val bigNote = BigNote("Belajar kotlinglang")
    println(bigNote.bigTitle)
    println(bigNote.title)
}