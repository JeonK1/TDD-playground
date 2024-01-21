package com.example.tddplayground.model

class Sum(
    val augend: Money,
    val addend: Money
): Expression {
    override fun reduce(to: String): Money = Money(augend.amount + addend.amount, to)
}
