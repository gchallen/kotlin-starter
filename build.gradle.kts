@file:Suppress("GradlePackageUpdate") // Suppress dependency update suggestions

plugins {
    kotlin("jvm") version "1.6.21"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test")) // Official Kotlin testing library
    testImplementation("io.kotest:kotest-runner-junit5:5.3.0") // kotest testing library
}

tasks.test {
    useJUnitPlatform()
}