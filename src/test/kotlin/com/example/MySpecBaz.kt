package com.example

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MySpecBaz : FunSpec() {
    init {
        test("baz test 1") {
            Thread.sleep(5000)
            true shouldBe true
        }
        test("baz test 2") {
            Thread.sleep(5000)
            true shouldBe true
        }
        test("baz test 3") {
            Thread.sleep(5000)
            true shouldBe true
        }
        test("baz test 4") {
            Thread.sleep(5000)
            true shouldBe true
        }
        test("baz test 5") {
            Thread.sleep(5000)
            true shouldBe true
        }
    }
}
