package com.example

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SomeSpec : FunSpec() {
    init {
        test("some test") {
            1 shouldBe 1
        }
    }
}