package com.example.tddtool.product

open class TestCase(open val name: String) {
    open fun setUp() {
    }

    open fun tearDown() {
    }

    fun run(): TestResult {
        val result = TestResult()
        result.testStarted()
        setUp()
        val method = javaClass.getMethod(name)
        method(this)
        tearDown()
        return result
    }
}
