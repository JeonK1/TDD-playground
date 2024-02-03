package com.example.tddtool.product

open class TestCase(open val name: String) {
    fun run() {
        val method = javaClass.getMethod(name)
        method(this)
    }
}
