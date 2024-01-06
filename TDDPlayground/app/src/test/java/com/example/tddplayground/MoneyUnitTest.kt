package com.example.tddplayground

import com.example.tddplayground.model.Dollar
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

    @Test
    fun testCurrency() {
        assertEquals("USD", Money.dollar(1).currency)
        assertEquals("CHF", Money.franc(1).currency)
    }

    @Test
    fun testDifferentClassEquality() {
        assertTrue(Money(10, "USD").equals(Dollar(10, "USD")))
        assertFalse(Money(10, "CHF").equals(Dollar(10, "USD")))
    }

    @Test
    fun testMultiplication() {
        var five: Money = Money.dollar(5)
        assertEquals(Money.dollar(10), five.times(2))

        five = Money.franc(5)
        assertEquals(Money.franc(10), five.times(2))
    }

    @Test
    fun testMultiplication2() {
        var five: Money = Money.dollar(5)
        assertEquals(Money.dollar(10), five.times(2))
        assertEquals(Money.dollar(15), five.times(3))

        five = Money.franc(5)
        assertEquals(Money.franc(10), five.times(2))
        assertEquals(Money.franc(15), five.times(3))
    }
}
