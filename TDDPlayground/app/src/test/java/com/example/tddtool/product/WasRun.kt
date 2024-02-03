package com.example.tddtool.product

class WasRun(override val name: String) : TestCase(name) {
    var wasRun: Boolean = false

    fun testMethod() {
        wasRun = true
    }
}
