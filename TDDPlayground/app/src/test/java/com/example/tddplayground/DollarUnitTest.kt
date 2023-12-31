package com.example.tddplayground

import com.example.tddplayground.model.Money
import org.junit.Assert.assertEquals
import org.junit.Test

class DollarUnitTest {
    @Test
    fun testMultiplication() {
        val five: Money = Money.dollar(5)
        val result = five.times(2)
        assertEquals(Money.dollar(10), result)
    }

    @Test
    fun testMultiplication2() {
        val five = Money.dollar(5)
        assertEquals(Money.dollar(10), five.times(2))
        assertEquals(Money.dollar(15), five.times(3))
    }
}
