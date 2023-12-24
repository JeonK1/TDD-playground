package com.example.tddplayground.model

class Franc(private val amount: Int) {
    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        val others = other as Franc
        return amount == others.amount
    }
}
