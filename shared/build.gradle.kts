plugins {
    kotlin(Plugins.Common.multiplatform)
    kotlin(Plugins.Common.nativeCocoapods)
    kotlin(Plugins.Common.kotlinSerialization)
    id(Plugins.Android.library)
}

version = Config.Shared.version

kotlin {
    android()
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        ios.deploymentTarget = "14.1"
        podfile = project.file("../iosApp/Podfile")
        framework {
            baseName = Config.Shared.name
        }
    }
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(Libs.Coroutines.core)
                implementation(Libs.Serialization.kotlinSerialization)
                implementation(Libs.Network.ktorCore)
                implementation(Libs.Network.ktorSerialization)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin(TestLibs.Shared.test))
            }
        }
        val androidMain by getting {
            dependencies {
                implementation(Libs.Network.Android.ktorClient)
            }
        }
        val androidTest by getting
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
            dependencies {
                implementation(Libs.Network.Ios.ktorClient)
            }
        }
        val iosX64Test by getting
        val iosArm64Test by getting
        val iosSimulatorArm64Test by getting
        val iosTest by creating {
            dependsOn(commonTest)
            iosX64Test.dependsOn(this)
            iosArm64Test.dependsOn(this)
            iosSimulatorArm64Test.dependsOn(this)
        }
    }

}

android {
    compileSdk = 32
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = Config.Android.minSdk
        targetSdk = Config.Android.targetSdk
    }
}