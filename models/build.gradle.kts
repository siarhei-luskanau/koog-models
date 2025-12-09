plugins {
    alias(libs.plugins.kotlin.jvm)
    `maven-publish`
}

group = "sl.koog"
version = "0.0.1-SNAPSHOT"
description = "An adiitional Koog LLM Models"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(libs.versions.jdkVersion.get())
    }
}

dependencies {
    implementation(libs.koog.prompt.llm)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}
