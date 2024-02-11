package com.example.tddtool.product

class WasRun(override val name: String) : TestCase(name) {
    var wasRun: Boolean = false

    fun testMethod() {
        wasRun = true
        log += "testMethod "
    }

    fun testBrokenMethod() {
        throw Exception()
    }

    override fun setUp() {
        wasRun = false
        log += "setUp "
    }

    override fun tearDown() {
        log += "tearDown "
    }
}
