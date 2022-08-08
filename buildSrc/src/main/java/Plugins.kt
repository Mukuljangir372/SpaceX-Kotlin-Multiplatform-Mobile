
object Plugins {

    object Common {
        val multiplatform by lazy { "multiplatform" }
        val nativeCocoapods by lazy { "native.cocoapods" }
        val kotlinSerialization by lazy { "plugin.serialization" }
        val sqlDelight by lazy { "com.squareup.sqldelight" }
    }

    object Android {
        val android by lazy { "android" }
        val application by lazy { "com.android.application" }
        val library by lazy { "com.android.library" }
        val kotlinKapt by lazy { "kotlin-kapt" }
        val kotlinAndroid by lazy { "org.jetbrains.kotlin.android" }
    }

}