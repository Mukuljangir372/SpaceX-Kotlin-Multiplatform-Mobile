buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath(BuildSystem.Libs.kotlinGradlePlugin)
        classpath(BuildSystem.Libs.gradle)
        classpath(BuildSystem.Libs.kotlinSerialization)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}