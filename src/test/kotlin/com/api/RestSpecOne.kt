package com.api

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class RestSpecOne : FunSpec() {
    init {
        test("rest test 1") {
            Thread.sleep(11000)
            true shouldBe true
        }
        test("rest test 2") {
            Thread.sleep(11000)
            true shouldBe true
        }
        test("rest test 3") {
            Thread.sleep(11000)
            true shouldBe true
        }
    }
}
