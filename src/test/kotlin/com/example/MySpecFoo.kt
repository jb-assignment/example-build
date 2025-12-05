package com.example

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MySpecFoo : FunSpec() {
    init {
        test("foo test 1") {
            Thread.sleep(5000)
            true shouldBe true
        }
        test("foo test 2") {
            Thread.sleep(5000)
            true shouldBe true
        }
        test("foo test 3") {
            Thread.sleep(5000)
            true shouldBe true
        }
        test("foo test 4") {
            Thread.sleep(5000)
            true shouldBe true
        }
        test("foo test 5") {
            Thread.sleep(5000)
            true shouldBe true
        }
    }
}
