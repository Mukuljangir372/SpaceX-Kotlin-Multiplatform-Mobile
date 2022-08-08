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
        classpath(BuildSystem.Libs.sqlDelight)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
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