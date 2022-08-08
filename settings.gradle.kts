pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "SpaceX"
include(":androidApp")
include(":shared")
include(":api")
include(":networking")
include(":domain")
include(":mapping")
include(":rocket-launch-local")
include(":rocket-launch-network")
include(":rocket-launch-domain")
include(":rocket-launch-central")
include(":rocket-launch-models")
