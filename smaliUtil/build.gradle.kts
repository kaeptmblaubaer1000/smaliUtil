import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-library`
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation("org.smali:baksmali:2.2.5") {
        exclude(group = "com.google.guava")
    }
}

java.setSourceCompatibility("1.8")
java.setTargetCompatibility("1.8")

tasks.withType(KotlinCompile::class.java) { ->
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
