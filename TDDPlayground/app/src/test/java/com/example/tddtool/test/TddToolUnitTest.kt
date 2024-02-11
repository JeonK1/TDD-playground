package com.example.tddtool.test

import com.example.tddtool.product.WasRun
import org.junit.Before
import org.junit.Test

class TddToolUnitTest {
    private lateinit var test: WasRun

    @Test
    fun testTemplateMethod() {
        test = WasRun("testMethod")
        test.run()
        assert("setUp testMethod tearDown " == test.log)
    }
}
