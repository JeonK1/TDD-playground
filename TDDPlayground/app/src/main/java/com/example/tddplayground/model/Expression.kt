package com.example.tddplayground.model

interface Expression {
    fun reduce(to: String): Money
}
