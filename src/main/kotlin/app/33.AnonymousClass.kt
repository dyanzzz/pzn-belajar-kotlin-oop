package app

import data.Action

fun main() {
    fireAction(SampleAction())

    fireAction(object : Action{
        override fun action() {
            println("action 1")
        }
    })

    fireAction(object : Action{
        override fun action() = println("action 2")
    })
}

fun fireAction(action: Action) {
    action.action()
}

class SampleAction : Action{
    override fun action() {
        println("this is sample action")
    }
}