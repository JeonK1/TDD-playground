package com.example.tddplayground

import com.example.tddplayground.model.Franc
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class FrancUnitTest {
    @Test
    fun testMultiplication() {
        val five = Franc(5)
        val result = five.times(2)
        assertEquals(Franc(10), result)
    }

    @Test
    fun testMultiplication2() {
        val five = Franc(5)
        assertEquals(Franc(10), five.times(2))
        assertEquals(Franc(15), five.times(3))
    }

    @Test
    fun testEquality() {
        assertTrue(Franc(5).equals(Franc(5)))
        assertFalse(Franc(5).equals(Franc(6)))
    }
}
