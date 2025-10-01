plugins {
    kotlin("jvm") version libs.versions.kotlin
}


repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(8)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}