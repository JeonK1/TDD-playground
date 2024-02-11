package com.example.tddtool.test

import com.example.tddtool.product.SetUpErrorCase
import com.example.tddtool.product.TestCase
import com.example.tddtool.product.TestResult
import com.example.tddtool.product.WasRun
import org.junit.Before
import org.junit.Test

class TddToolUnitTest {
    private lateinit var test: TestCase
    private lateinit var result: TestResult

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
        result = test.run()
        assert("1 run, 1 failed" == result.summary())
    }

    @Test
    fun testFailedResultFormatting() {
        result = TestResult()
        result.testStarted()
        result.testFailed()
        assert("1 run, 1 failed" == result.summary())
    }

    @Test
    fun testSetUpFailed() {
        test = SetUpErrorCase("testMethod")
        result = test.run()
        assert("1 run, 1 failed" == result.summary())
    }
}
