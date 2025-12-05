package com.example

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class QuickSpec : FunSpec() {
    init {
        test("quick test 1") {
            Thread.sleep(4000)
            true shouldBe true
        }
        test("quick test 2") {
            Thread.sleep(4000)
            true shouldBe true
        }
        test("quick test 3") {
            Thread.sleep(4000)
            true shouldBe true
        }
        test("quick test 4") {
            Thread.sleep(4000)
            true shouldBe true
        }
        test("quick test 5") {
            Thread.sleep(4000)
            true shouldBe true
        }
        test("quick test 6") {
            Thread.sleep(4000)
            true shouldBe true
        }
        test("quick test 7") {
            Thread.sleep(4000)
            true shouldBe true
        }
        test("quick test 8") {
            Thread.sleep(4000)
            true shouldBe true
        }
    }
}
