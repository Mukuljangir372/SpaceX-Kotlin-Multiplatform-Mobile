plugins {
    id(Plugins.Android.library)
    id(Plugins.Android.kotlinAndroid)
}

android {
    compileSdk = 32

    defaultConfig {
        multiDexEnabled = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Libs.AndroidSupport.coreKtx)
}