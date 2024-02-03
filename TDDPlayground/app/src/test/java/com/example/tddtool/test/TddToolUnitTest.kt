package com.example.tddtool.test

import com.example.tddtool.product.WasRun
import org.junit.Before
import org.junit.Test

class TddToolUnitTest {
    private lateinit var test: WasRun

    @Before
    fun setUp() {
        test = WasRun("testMethod")
    }


    @Test
    fun testRunning() {
        test.run()
        assert(test.wasRun)
    }

    @Test
    fun testSetUp() {
        test.run()
        assert(test.wasSetUp)
    }
}
