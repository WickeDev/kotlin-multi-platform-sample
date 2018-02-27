@file:Suppress("unused")

package net.codesanctum.kmp

import kotlin.test.Test
import kotlin.test.assertEquals

class CalculatorTest {

    @Test
    fun addTest() {
        val result = Calculator.add(1, 2)
        assertEquals(result, 3)
    }
}