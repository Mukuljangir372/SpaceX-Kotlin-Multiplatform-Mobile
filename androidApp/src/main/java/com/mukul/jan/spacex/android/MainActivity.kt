package com.mukul.jan.spacex.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mukul.jan.spacex.Greeting

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}
