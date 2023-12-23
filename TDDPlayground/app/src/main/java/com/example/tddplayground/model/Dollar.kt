package com.example.tddplayground.model

class Dollar(private val amount: Int) {
    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        val others = other as Dollar
        return amount == others.amount
    }
}
