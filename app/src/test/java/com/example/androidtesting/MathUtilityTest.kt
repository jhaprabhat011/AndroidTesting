package com.example.androidtesting

import org.junit.*
import org.junit.Assert.*
import java.lang.ArithmeticException

class MathUtilityTest {

    var utility: MathUtility? = null

    @Before
    fun initializeTest() {
        utility = MathUtility()
    }

    @After
    fun releaseTest() {
        utility = null
    }


    @Ignore
    @Test
    fun testAdd() {
        val actualSum = utility?.add(10, 20)

        assertEquals("10 + 20 should be 30", 30, actualSum)

    }

    @Ignore
    @Test
    fun testSubtract() {
        val subResult = utility?.subtract(20, 10)

        assertEquals(10, subResult)

    }

    @Ignore
    @Test
    fun testMultiply() {
        val product = utility?.multiply(10, 20)
        assertEquals(200, product)

    }

    @Ignore
    @Test
    fun testMultiplyWithZero() {
        val product = utility?.multiply(10, 0)
        assertEquals("Multiplication with 0 is always 0", 0, product)
    }

    @Test
    fun testDivision() {

        assertNotNull(utility?.PI)

        val division = utility?.divide(10, 2)
        assertEquals(2, division)

    }

    @Test(expected = ArithmeticException::class)
    fun testDivisionByZero() {
        val division = utility?.divide(10, 0)

    }
}