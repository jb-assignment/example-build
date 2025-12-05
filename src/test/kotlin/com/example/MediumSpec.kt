package com.example

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MediumSpec : FunSpec() {
    init {
        test("medium test 1") {
            Thread.sleep(7000)
            true shouldBe true
        }
        test("medium test 2") {
            Thread.sleep(7000)
            true shouldBe true
        }
        test("medium test 3") {
            Thread.sleep(7000)
            true shouldBe true
        }
        test("medium test 4") {
            Thread.sleep(7000)
            true shouldBe true
        }
        test("medium test 5") {
            Thread.sleep(7000)
            true shouldBe true
        }
    }
}
