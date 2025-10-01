import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    `maven-publish`
    `java-library`
}

group = "com.github.tanokun.reactivesk"
version = "1.0.0"


repositories {
    maven("https://repo.skriptlang.org/releases")
    maven("https://repo.destroystokyo.com/repository/maven-public")
    mavenCentral()
}

dependencies {
    implementation(libs.bytebuddy)

    implementation(project(":lang"))
    implementation(project(":compiler-frontend"))
    implementation(project(":compiler-backend"))

    testImplementation(kotlin("test"))
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
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/tanoKun/ReactiveSk-Common")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}

tasks.test {
    useJUnitPlatform()
}
