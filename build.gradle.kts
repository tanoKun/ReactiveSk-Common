plugins {
    kotlin("jvm") version libs.versions.kotlin
}

kotlin {
    jvmToolchain(8)
}

repositories {
    mavenCentral()
}