package libs.common

object Libs {

    //KOTLIN
    //-------------------------------------------------------------------------------------------------
    private val coroutinesVersion by lazy { "1.6.0" }
    val coroutines by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion" }

    private val kotlinSerializationVersion by lazy { "1.4.0-RC" }
    val kotlinSerialization by lazy { "org.jetbrains.kotlinx:kotlinx-serialization-core:$kotlinSerializationVersion"}

}