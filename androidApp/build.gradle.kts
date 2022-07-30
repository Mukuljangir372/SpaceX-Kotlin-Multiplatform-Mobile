plugins {
    id(Plugins.Android.application)
    kotlin(Plugins.Android.android)
}

android {
    compileSdk = Config.Android.compileSdk
    defaultConfig {
        applicationId = Config.Android.id
        minSdk = Config.Android.minSdk
        targetSdk = Config.Android.targetSdk
        versionCode = Config.Android.version
        versionName = Config.Android.versionName
    }
    buildTypes {
        getByName(BuildTypes.Android.release) {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(Modules.Common.shared))
    implementation(libs.android.Libs.material)
    implementation(libs.android.Libs.appcompat)
    implementation(libs.android.Libs.constraintLayout)
}