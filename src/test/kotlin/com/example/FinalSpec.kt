package com.example

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FinalSpec : FunSpec() {
    init {
        test("final test 1") {
            Thread.sleep(6000)
            true shouldBe true
        }
        test("final test 2") {
            Thread.sleep(6000)
            true shouldBe true
        }
        test("final test 3") {
            Thread.sleep(6000)
            true shouldBe true
        }
    }
}
