package com.example.tddplayground.model

abstract class Money(val amount: Int) {

    companion object {
        fun dollar(amount: Int): Dollar = Dollar(amount)
        fun franc(amount: Int): Franc = Franc(amount)
    }

    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return (amount == money.amount) && (javaClass == other.javaClass)
    }

    abstract fun times(multiplier: Int): Money
}
