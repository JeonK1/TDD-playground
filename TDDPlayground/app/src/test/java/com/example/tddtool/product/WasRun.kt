package com.example.tddtool.product

class WasRun(override val name: String) : TestCase(name) {
    var wasRun: Boolean = false
    var log: String = ""

    fun testMethod() {
        wasRun = true
        log += "testMethod "
    }

    override fun setUp() {
        wasRun = false
        log += "setUp "
    }

    override fun tearDown() {
        log += "tearDown "
    }
}
