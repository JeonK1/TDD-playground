package com.example.tddplayground

import com.example.tddplayground.model.Dollar
import org.junit.Assert.assertEquals
import org.junit.Test

class DollarUnitTest {
    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        five.times(2)
        assertEquals(10, five.amount)
    }
}
