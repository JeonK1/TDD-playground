package com.example.tddplayground.model

open class Money(val amount: Int, val currency: String): Expression {

    companion object {
        fun dollar(amount: Int): Money = Money(amount, "USD")
        fun franc(amount: Int): Money = Money(amount, "CHF")
    }

    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return (amount == money.amount) && (currency == other.currency)
    }

    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    fun plus(money: Money): Expression {
        return Money(amount + money.amount, currency)
    }
}
