package com.example.codelab31

import org.junit.Assert.*
import org.junit.Test
import java.math.BigDecimal

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addTwoNumbers() {
        assertEquals(4, 2 + 2)
        assertEquals(8, 4 + 4)
    }

    @Test
    fun addTwoNumbersNegative() {
        assertEquals(-4, -2 + -2)
        assertEquals(-8, -4 + -4)
    }

    @Test
    fun addTwoNumbersFloats() {
        assertEquals(BigDecimal(4.4), BigDecimal(2.2) + BigDecimal(2.2))
        assertEquals(BigDecimal(0.0), BigDecimal(-4.2) + BigDecimal(4.2))
    }

    @Test
    fun subTwoNumbers() {
        assertEquals(0,  4 - 4)
        assertEquals(5, 10 - 5)
    }

    @Test
    fun subWorksWithNegativeResult() {
        assertEquals(0,  -4 - -4)
        assertEquals(-5, -10 - -5)
    }

    @Test
    fun mulTwoNumbers() {
        assertEquals(BigDecimal(13.14), BigDecimal(3.2) * BigDecimal(4.2))
        assertEquals(-50, -5 * 10)
    }

    @Test
    fun divTwoNumbers() {
        assertEquals(8, 56 / 7)
        assertEquals(8, 24 / 3)
    }
}