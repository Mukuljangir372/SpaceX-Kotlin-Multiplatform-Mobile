package libs.android

object Libs {

    //BASE
    //-----------------------------------------------------------------------------------------------------
    private val appcompatVersion by lazy { "1.3.1" }
    val appcompat by lazy { "androidx.appcompat:appcompat:$appcompatVersion" }

    //MATERIAL DESIGN
    //-----------------------------------------------------------------------------------------------------
    private val materialVersion by lazy { "1.4.0" }
    val material by lazy { "com.google.android.material:material:$materialVersion" }

    private val constraintLayoutVersion by lazy { "2.1.0" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion" }


}