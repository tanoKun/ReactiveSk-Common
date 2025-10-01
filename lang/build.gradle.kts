plugins {
    kotlin("jvm") version libs.versions.kotlin
}

group = "com.github.tanokun.reactivesk"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
}

tasks.test {
    useJUnitPlatform()
}