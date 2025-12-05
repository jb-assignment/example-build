package com.example

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class DataSpec : FunSpec() {
    init {
        test("data test 1") {
            Thread.sleep(8000)
            true shouldBe true
        }
        test("data test 2") {
            Thread.sleep(8000)
            true shouldBe true
        }
        test("data test 3") {
            Thread.sleep(8000)
            true shouldBe true
        }
        test("data test 4") {
            Thread.sleep(8000)
            true shouldBe true
        }
    }
}
