
val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
    kotlin("jvm") version "1.7.0"
    id("io.ktor.plugin") version "2.2.4"
}

group = "com.michaelpixleyjr"
version = "0.0.1"

application {
    mainClass.set("io.ktor.server.netty.EngineMain")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation( "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version")
    implementation( "io.ktor:ktor-server-netty:$ktor_version")
    implementation( "io.ktor:ktor-server-core:$ktor_version")
    implementation( "io.ktor:ktor-server-auth:$ktor_version")
    implementation( "org.litote.kmongo:kmongo:4.2.7")
    implementation( "org.litote.kmongo:kmongo-coroutine:4.2.7")
    implementation( "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
    implementation( "commons-codec:commons-codec:1.14")
    implementation( "ch.qos.logback:logback-classic:$logback_version")
    implementation("io.ktor:ktor-server-default-headers:$ktor_version")
    implementation("io.ktor:ktor-server-content-negotiation:$ktor_version")
    implementation("io.ktor:ktor-serialization-gson:$ktor_version")
    implementation("io.ktor:ktor-server-call-logging:$ktor_version")
}