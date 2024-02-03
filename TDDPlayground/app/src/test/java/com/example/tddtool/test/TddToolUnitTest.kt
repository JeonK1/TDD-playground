package com.example.tddtool.test

import com.example.tddtool.product.WasRun
import org.junit.Test

class TddToolUnitTest {
    @Test
    fun testRunning() {
        val test = WasRun("testMethod")
        assert(test.wasRun.not())
        test.run()
        assert(test.wasRun)
    }
}
