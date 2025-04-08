plugins {
    kotlin("jvm") version "2.1.10"
    application
}

application {
    mainClass.set("com.technogise.chessgame.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-assertions-core:5.7.2")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}