package com.example.tddplayground.model

class Franc(amount: Int, currency: String) : Money(amount, currency) {
    override fun times(multiplier: Int): Money {
        return franc(amount * multiplier)
    }
}
