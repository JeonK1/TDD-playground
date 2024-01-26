package com.example.tddplayground.model

interface Expression {
    fun reduce(bank: Bank, to: String): Money
}
