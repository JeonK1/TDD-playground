package com.example.tddplayground.model

class Franc(amount: Int): Money(amount) {
    override fun times(multiplier: Int): Money {
        return Franc(amount * multiplier)
    }
}
