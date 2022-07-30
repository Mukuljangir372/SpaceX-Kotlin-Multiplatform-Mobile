
object BuildSystem {

    object Libs {
        private val gradleVersion by lazy { "7.2.1" }
        private val kotlinVersion by lazy { "1.7.10" }

        val gradle by lazy { "com.android.tools.build:gradle:$gradleVersion" }
        val kotlinGradlePlugin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion" }
        val kotlinSerialization by lazy { "org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion" }
    }

}