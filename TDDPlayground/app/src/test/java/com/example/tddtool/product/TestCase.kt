package com.example.tddtool.product

open class TestCase(open val name: String) {
    open fun setUp() {
    }

    fun run() {
        setUp()
        val method = javaClass.getMethod(name)
        method(this)
    }
}
