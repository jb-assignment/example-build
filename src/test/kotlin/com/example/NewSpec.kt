package com.example

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class NewSpec : FunSpec() {
    init {
        test("some new test") {
            Thread.sleep(1000)
            1 shouldBe 1
        }
    }
}