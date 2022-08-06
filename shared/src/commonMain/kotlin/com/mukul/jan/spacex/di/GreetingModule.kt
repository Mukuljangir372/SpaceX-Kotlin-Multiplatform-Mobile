package com.mukul.jan.spacex.di

import com.mukul.jan.spacex.Greeting
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val greetingModule = module {
    singleOf(::Greeting)
}