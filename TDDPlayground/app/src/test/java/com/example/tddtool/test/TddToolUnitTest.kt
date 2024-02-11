package com.example.tddtool.test

import com.example.tddtool.product.WasRun
import org.junit.Before
import org.junit.Test

class TddToolUnitTest {
    private lateinit var test: WasRun

    @Test
    fun testTemplateMethod() {
        test = WasRun("testMethod")
        test.run()
        assert("setUp testMethod tearDown " == test.log)
    }

    @Test
    fun testResult() {
        test = WasRun("testMethod")
        val result = test.run()
        assert("1 run, 0 failed" == result.summary())
    }

    @Test
    fun testFailedResult() {
        test = WasRun("testBrokenMethod")
        val result = test.run()
        assert("1 run, 1 failed" == result.summary())
    }
}
