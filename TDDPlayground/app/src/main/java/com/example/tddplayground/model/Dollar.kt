package com.example.tddplayground.model

class Dollar(var amount: Int) {
    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }
}
