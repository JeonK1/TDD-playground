package com.example.tddplayground

import com.example.tddplayground.model.Money
import org.junit.Assert.assertEquals
import org.junit.Test

class FrancUnitTest {
    @Test
    fun testMultiplication() {
        val five = Money.franc(5)
        val result = five.times(2)
        assertEquals(Money.franc(10), result)
    }

    @Test
    fun testMultiplication2() {
        val five = Money.franc(5)
        assertEquals(Money.franc(10), five.times(2))
        assertEquals(Money.franc(15), five.times(3))
    }
}
