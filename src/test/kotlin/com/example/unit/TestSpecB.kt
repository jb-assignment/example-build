package com.example.unit

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class TestSpecB : FunSpec() {
    init {
        test("unit test B1") {
            Thread.sleep(6000)
            true shouldBe true
        }
        test("unit test B2") {
            Thread.sleep(6000)
            true shouldBe true
        }
        test("unit test B3") {
            Thread.sleep(6000)
            true shouldBe true
        }
        test("unit test B4") {
            Thread.sleep(6000)
            true shouldBe true
        }
        test("unit test B5") {
            Thread.sleep(6000)
            true shouldBe true
        }
    }
}
