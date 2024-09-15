pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
    id("com.gradle.develocity") version "3.18"
}
develocity {
    server = "http://ge.solutions-team.gradle.com"
    allowUntrustedServer = true
    buildScan {
        uploadInBackground.set(false)
        publishing { true}
    }
}
rootProject.name = "untitled"
include("lib")
