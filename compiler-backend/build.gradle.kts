import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    `maven-publish`
    `java-library`
}

group = "com.github.tanokun"
version = "1.0.5"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":compiler-frontend"))
    implementation(project(":lang"))
    implementation(libs.bytebuddy)

    testImplementation(kotlin("test"))
    testImplementation(libs.mockk)
}

kotlin {
    jvmToolchain(8)
}

java {
    withSourcesJar()
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

tasks.withType<KotlinCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_1_8)
    }
}

tasks.withType<JavaCompile>().configureEach {
    sourceCompatibility = "1.8"
    targetCompatibility = "1.8"
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            artifactId = "compiler-backend"
            version = project.version.toString()
        }
    }
}

tasks.test {
    useJUnitPlatform()
}
