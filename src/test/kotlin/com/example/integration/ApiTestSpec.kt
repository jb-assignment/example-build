package com.example.integration

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ApiTestSpec : FunSpec() {
    init {
        test("api test 1") {
            Thread.sleep(7000)
            true shouldBe true
        }
        test("api test 2") {
            Thread.sleep(7000)
            true shouldBe true
        }
        test("api test 3") {
            Thread.sleep(7000)
            true shouldBe true
        }
        test("api test 4") {
            Thread.sleep(7000)
            true shouldBe true
        }
    }
}
