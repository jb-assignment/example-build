package com.service

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ServiceSpecBeta : FunSpec() {
    init {
        test("service beta test 1") {
            Thread.sleep(9000)
            true shouldBe true
        }
        test("service beta test 2") {
            Thread.sleep(9000)
            true shouldBe true
        }
        test("service beta test 3") {
            Thread.sleep(9000)
            true shouldBe true
        }
    }
}
