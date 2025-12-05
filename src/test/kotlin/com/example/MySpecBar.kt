package com.example

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MySpecBar : FunSpec() {
    init {
        test("bar test 1") {
            Thread.sleep(5000)
            true shouldBe true
        }
        test("bar test 2") {
            Thread.sleep(5000)
            true shouldBe true
        }
        test("bar test 3") {
            Thread.sleep(5000)
            true shouldBe true
        }
        test("bar test 4") {
            Thread.sleep(5000)
            true shouldBe true
        }
        test("bar test 5") {
            Thread.sleep(5000)
            true shouldBe true
        }
    }
}
