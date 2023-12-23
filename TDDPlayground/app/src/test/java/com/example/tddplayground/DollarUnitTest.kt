package com.example.tddplayground

import com.example.tddplayground.model.Dollar
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class DollarUnitTest {
    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        val result = five.times(2)
        assertEquals(10, result.amount)
    }

    @Test
    fun testMultiplication2() {
        val five = Dollar(5)
        var result = five.times(2)
        assertEquals(10, result.amount)
        result = five.times(3)
        assertEquals(15, result.amount)
    }

    @Test
    fun testEquality() {
        assertTrue(Dollar(5).equals(Dollar(5)))
        assertFalse(Dollar(5).equals(Dollar(6)))
    }
}
