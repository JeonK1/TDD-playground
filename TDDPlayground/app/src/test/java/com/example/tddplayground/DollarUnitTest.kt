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
        assertEquals(Dollar(10), five.times(2))
    }

    @Test
    fun testMultiplication2() {
        val five = Dollar(5)
        assertEquals(Dollar(10), five.times(2))
        assertEquals(Dollar(15), five.times(3))
    }

    @Test
    fun testEquality() {
        assertTrue(Dollar(5).equals(Dollar(5)))
        assertFalse(Dollar(5).equals(Dollar(6)))
    }
}
