package com.example.tddplayground

import com.example.tddplayground.model.Dollar
import com.example.tddplayground.model.Franc
import org.junit.Assert.*
import org.junit.Test

class MoneyUnitTest {
    @Test
    fun testEquality() {
        assertTrue(Dollar(5).equals(Dollar(5)))
        assertFalse(Dollar(5).equals(Dollar(6)))
        assertTrue(Franc(5).equals(Franc(5)))
        assertFalse(Franc(5).equals(Franc(6)))
        assertFalse(Dollar(5).equals(Franc(5)))
    }
}
