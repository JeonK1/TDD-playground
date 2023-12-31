package com.example.tddplayground

import com.example.tddplayground.model.Dollar
import org.junit.Assert.assertEquals
import org.junit.Test

class DollarUnitTest {
    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        val result = five.times(2)
        assertEquals(Dollar(10), result)
    }

    @Test
    fun testMultiplication2() {
        val five = Dollar(5)
        assertEquals(Dollar(10), five.times(2))
        assertEquals(Dollar(15), five.times(3))
    }
}
