
object Libs {

    enum class Lib(val version: String) {
        // Network
        KTOR("1.6.5"),
        KTOR_ANDROID("1.6.5"),
        KTOR_IOS("1.6.5"),

        // Serialization
        KOTLIN_SERIALIZATION("1.4.0-RC"),

        // Coroutines
        COROUTINES("1.6.0"),

        // AndroidX
        MATERIAL("1.4.0"),
        CONSTRAINT_LAYOUT("2.1.0"),

        // Android Support
        APP_COMPAT("1.3.1"),
    }

    object Storage {

    }

    object Network {
        val ktorCore by lazy { "io.ktor:ktor-client-core:${Lib.KTOR.version}" }
        val ktorSerialization by lazy { "io.ktor:ktor-client-serialization:${Lib.KTOR.version}" }

        object Android {
            val ktorClient by lazy { "io.ktor:ktor-client-android:${Lib.KTOR_ANDROID.version}" }
        }
        object Ios {
            val ktorClient by lazy { "io.ktor:ktor-client-ios:${Lib.KTOR_IOS.version}" }
        }
    }

    object Serialization {
        val kotlinSerialization by lazy { "org.jetbrains.kotlinx:kotlinx-serialization-core:${Lib.KOTLIN_SERIALIZATION.version}"}
    }

    object Coroutines {
        val core by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Lib.COROUTINES.version}" }
    }

    object AndroidX {
        val material by lazy { "com.google.android.material:material:${Lib.MATERIAL.version}" }
        val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Lib.CONSTRAINT_LAYOUT.version}" }
    }

    object AndroidSupport {
        val appcompat by lazy { "androidx.appcompat:appcompat:${Lib.APP_COMPAT.version}" }
    }

}
