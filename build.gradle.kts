@file:Suppress("UnstableApiUsage")

plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    implementation(libs.kotest.runnerJunit5)
}

testing.suites.withType<JvmTestSuite>().configureEach {
    useJUnitJupiter()
}