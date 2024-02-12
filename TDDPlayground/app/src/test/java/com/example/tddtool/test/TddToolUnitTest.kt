package com.example.tddtool.test

import com.example.tddtool.product.SetUpErrorCase
import com.example.tddtool.product.TestCase
import com.example.tddtool.product.TestResult
import com.example.tddtool.product.TestSuite
import com.example.tddtool.product.WasRun
import org.junit.Before
import org.junit.Test

class TddToolUnitTest {
    private lateinit var test: TestCase
    private lateinit var result: TestResult

    @Before
    fun setUp() {
        result = TestResult()
    }

    @Test
    fun testTemplateMethod() {
        test = WasRun("testMethod")
        test.run(result)
        assert("setUp testMethod tearDown " == test.log)
    }

    @Test
    fun testResult() {
        test = WasRun("testMethod")
        test.run(result)
        assert("1 run, 0 failed" == result.summary())
    }

    @Test
    fun testFailedResult() {
        test = WasRun("testBrokenMethod")
        test.run(result)
        assert("1 run, 1 failed" == result.summary())
    }

    @Test
    fun testFailedResultFormatting() {
        result.testStarted()
        result.testFailed()
        assert("1 run, 1 failed" == result.summary())
    }

    @Test
    fun testSetUpFailed() {
        test = SetUpErrorCase("testMethod")
        test.run(result)
        assert("1 run, 1 failed" == result.summary())
    }

    @Test
    fun testSuite() {
        val suite = TestSuite()
        suite.add(WasRun("testMethod"))
        suite.add(WasRun("testBrokenMethod"))
        suite.run(result)
        assert("2 run, 1 failed" == result.summary())
    }

    @Test
    fun testTearDownIfFailed() {
        test = WasRun("testBrokenMethod")
        test.run(result)
        println(test.log)
        assert("setUp tearDown " == test.log)
    }
}
