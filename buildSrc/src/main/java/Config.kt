
object Config {

    object Shared {
        val name by lazy { "shared" }
        val version by lazy { "1.0" }
    }

    object Android {
        val id by lazy { "com.mukul.jan.spacex.android" }
        val minSdk by lazy { 24 }
        val compileSdk by lazy { 32 }
        val targetSdk by lazy { 32 }
        val version by lazy { 1 }
        val versionName by lazy { "1.0" }
    }

}