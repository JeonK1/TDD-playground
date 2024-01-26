package com.example.tddplayground.model

import java.util.Hashtable

class Pair(private val from: String, private val to: String) {
    override fun equals(other: Any?): Boolean {
        val pair = other as Pair
        return from.equals(pair.from) && to.equals(pair.to)
    }

    override fun hashCode(): Int {
        return 0
    }
}
