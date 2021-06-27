package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("budi")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Dyan", 1_000_000)
    println(executiveCustomer.name)
    println(executiveCustomer.type)
    println(executiveCustomer.balance)
}