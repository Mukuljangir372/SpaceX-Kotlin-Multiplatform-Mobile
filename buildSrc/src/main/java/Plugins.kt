
object Plugins {

    object Common {
        //base
        val multiplatform by lazy { "multiplatform" }
        val nativeCocoapods by lazy { "native.cocoapods" }

        //kotlin
        val kotlinSerialization by lazy { "plugin.serialization" }
    }

    object Android {
        //base
        val android by lazy { "android" }
        val application by lazy { "com.android.application" }
        val library by lazy { "com.android.library" }
    }

}