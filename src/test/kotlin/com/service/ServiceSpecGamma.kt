package com.service

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ServiceSpecGamma : FunSpec() {
    init {
        test("service gamma test 1") {
            Thread.sleep(9000)
            true shouldBe true
        }
        test("service gamma test 2") {
            Thread.sleep(9000)
            true shouldBe true
        }
        test("service gamma test 3") {
            Thread.sleep(9000)
            true shouldBe true
        }
    }
}
