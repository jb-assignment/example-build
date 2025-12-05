package com.example.unit

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class TestSpecA : FunSpec() {
    init {
        test("unit test A1") {
            Thread.sleep(6000)
            true shouldBe true
        }
        test("unit test A2") {
            Thread.sleep(6000)
            true shouldBe true
        }
        test("unit test A3") {
            Thread.sleep(6000)
            true shouldBe true
        }
        test("unit test A4") {
            Thread.sleep(6000)
            true shouldBe true
        }
        test("unit test A5") {
            Thread.sleep(6000)
            true shouldBe true
        }
    }
}
