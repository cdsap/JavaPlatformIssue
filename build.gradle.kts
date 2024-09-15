plugins {
    kotlin("jvm") version "1.9.20"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(enforcedPlatform(project(":lib")))
}

project.configurations.register("x") {
    extendsFrom(project.configurations.getByName(JavaPlugin.RUNTIME_CLASSPATH_CONFIGURATION_NAME))
    isCanBeResolved = true
}

tasks.register("foo") {
    project.configurations.getByName("x").resolve()
}

tasks.all {}

