package com.example.tddplayground

import com.example.tddplayground.model.Money
import org.junit.Assert.*
import org.junit.Test

class MoneyUnitTest {
    @Test
    fun testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)))
        assertFalse(Money.dollar(5).equals(Money.dollar(6)))
        assertTrue(Money.franc(5).equals(Money.franc(5)))
        assertFalse(Money.franc(5).equals(Money.franc(6)))
        assertFalse(Money.dollar(5).equals(Money.franc(5)))
    }
}
