package com.example

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SlowSpec : FunSpec() {
    init {
        test("slow test 1") {
            Thread.sleep(10000)
            true shouldBe true
        }
        test("slow test 2") {
            Thread.sleep(10000)
            true shouldBe true
        }
        test("slow test 3") {
            Thread.sleep(10000)
            true shouldBe true
        }
        test("slow test 4") {
            Thread.sleep(10000)
            true shouldBe true
        }
        test("slow test 5") {
            Thread.sleep(10000)
            true shouldBe true
        }
    }
}
