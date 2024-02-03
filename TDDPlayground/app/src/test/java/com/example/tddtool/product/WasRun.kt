package com.example.tddtool.product

class WasRun(override val name: String) : TestCase(name) {
    var wasRun: Boolean = false
    var wasSetUp: Boolean = false

    fun testMethod() {
        wasRun = true
    }

    override fun setUp() {
        wasRun = false
        wasSetUp = true
    }
}
