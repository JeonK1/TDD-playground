package com.example.tddtool.product

class SetUpErrorCase(override val name: String) : TestCase(name) {
    var wasRun: Boolean = false

    fun testMethod() {
        wasRun = true
        log += "testMethod "
    }


    override fun setUp() {
        throw Exception()
    }

    override fun tearDown() {
        log += "tearDown "
    }
}
