package com.example.tddplayground.model

import java.util.Hashtable

class Bank {
    private val rates = Hashtable<Pair, Int>()

    fun reduce(source: Expression, to: String): Money {
        if (source is Money)
            return source.reduce(this, to) as Money

        val sum = source as Sum
        return sum.reduce(this, to)
    }

    fun rate(from: String, to: String): Int {
        if (from.equals(to)) return 1
        return rates.get(Pair(from, to)) ?: throw Exception("환율이 존재하지 않습니다.")
    }

    fun addRate(from: String, to: String, rate: Int) {
        rates.put(Pair(from, to), rate)
    }
}
