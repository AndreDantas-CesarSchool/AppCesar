package com.example.appcesarci

import org.junit.Before
import org.junit.Test


class CalculatorTest{
    lateinit var classToTest: Calculator

    @Before
    fun setUp() {
        classToTest = Calculator()
    }

    @Test
    fun calculate() {
        assert(classToTest.soma(2, 2) == 4)
    }

}