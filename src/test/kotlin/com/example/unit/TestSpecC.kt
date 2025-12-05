package com.example.unit

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class TestSpecC : FunSpec() {
    init {
        test("unit test C1") {
            Thread.sleep(6000)
            true shouldBe true
        }
        test("unit test C2") {
            Thread.sleep(6000)
            true shouldBe true
        }
        test("unit test C3") {
            Thread.sleep(6000)
            true shouldBe true
        }
        test("unit test C4") {
            Thread.sleep(6000)
            true shouldBe true
        }
        test("unit test C5") {
            Thread.sleep(6000)
            true shouldBe true
        }
    }
}
