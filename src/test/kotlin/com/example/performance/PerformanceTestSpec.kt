package com.example.performance

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class PerformanceTestSpec : FunSpec() {
    init {
        test("performance test 1") {
            Thread.sleep(12000)
            true shouldBe true
        }
        test("performance test 2") {
            Thread.sleep(12000)
            true shouldBe true
        }
        test("performance test 3") {
            Thread.sleep(12000)
            true shouldBe true
        }
        test("performance test 4") {
            Thread.sleep(12000)
            true shouldBe true
        }
        test("performance test 5") {
            Thread.sleep(13000)
            true shouldBe true
        }
    }
}
