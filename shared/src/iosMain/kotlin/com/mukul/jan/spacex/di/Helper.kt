package com.mukul.jan.spacex.di

import com.mukul.jan.spacex.Greeting
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin

class GreetingHelper: KoinComponent {
    private val greet : Greeting by inject()
    fun greet(): String {
        return greet.greeting()
    }
}

fun initKoin() {
    startKoin {
        modules(appModule())
    }
}