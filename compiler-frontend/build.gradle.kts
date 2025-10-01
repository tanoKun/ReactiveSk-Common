plugins {
    kotlin("jvm")
    `maven-publish`
    `java-library`

    antlr
}

group = "com.github.tanokun.reactivesk"
version = "1.0.0"

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
    maxHeapSize = "64m"
    arguments = arguments + listOf("-visitor", "-long-messages")
}

tasks.compileKotlin {
    dependsOn(tasks.generateGrammarSource)
}

tasks.compileTestKotlin {
    dependsOn(tasks.generateTestGrammarSource)
}

kotlin {
    jvmToolchain(8)
}

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    from(sourceSets["main"].allSource)

    val genDir = layout.buildDirectory.dir("generated-src/antlr/main")
    dependsOn(tasks.named("generateGrammarSource"))
    from(genDir) {
        include("**/*")
    }
    inputs.dir(genDir)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            artifact(sourcesJar.get())
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/tanoKun/ReactiveSk-Common")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN") // or use PAT in secrets
            }
        }
    }
}