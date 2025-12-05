package com.example.integration

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class IntegrationTestSpec : FunSpec() {
    init {
        test("integration test 1") {
            Thread.sleep(8000)
            true shouldBe true
        }
        test("integration test 2") {
            Thread.sleep(8000)
            true shouldBe true
        }
        test("integration test 3") {
            Thread.sleep(8000)
            true shouldBe true
        }
        test("integration test 4") {
            Thread.sleep(8000)
            true shouldBe true
        }
    }
}
