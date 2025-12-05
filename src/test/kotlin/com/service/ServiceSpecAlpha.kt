package com.service

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ServiceSpecAlpha : FunSpec() {
    init {
        test("service alpha test 1") {
            Thread.sleep(9000)
            true shouldBe true
        }
        test("service alpha test 2") {
            Thread.sleep(9000)
            true shouldBe true
        }
        test("service alpha test 3") {
            Thread.sleep(9000)
            true shouldBe true
        }
    }
}
