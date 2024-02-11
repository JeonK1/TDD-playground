package com.example.tddtool.product

open class TestCase(open val name: String) {
    open var log: String = ""

    open fun setUp() {
    }

    open fun tearDown() {
    }

    fun run(): TestResult {
        val result = TestResult()
        result.testStarted()
        try {
            setUp()
            val method = javaClass.getMethod(name)
            method(this)
        } catch (e: Exception) {
            result.testFailed()
        }
        tearDown()
        return result
    }
}
