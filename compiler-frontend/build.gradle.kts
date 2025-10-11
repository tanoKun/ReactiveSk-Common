import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    `maven-publish`
    `java-library`

    antlr
}

group = "com.github.tanoKun"
version = "1.0.2"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":lang"))
    implementation(libs.antlr.kotlin.runtime)
    antlr(libs.antlr.tool)

    testImplementation(kotlin("test"))
}

tasks.generateGrammarSource {
    isEnabled = false
}

tasks.generateTestGrammarSource {
    isEnabled = false
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

tasks.named<Jar>("sourcesJar") {
    archiveClassifier.set("sources")
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    from(sourceSets["main"].allSource)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            artifactId = "compiler-frontend"
        }
    }
}

tasks.test {
    useJUnitPlatform()
}