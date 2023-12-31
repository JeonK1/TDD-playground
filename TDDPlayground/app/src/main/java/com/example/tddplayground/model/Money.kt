package com.example.tddplayground.model

open class Money(val amount: Int) {
    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return (amount == money.amount) && (javaClass == other.javaClass)
    }
}
