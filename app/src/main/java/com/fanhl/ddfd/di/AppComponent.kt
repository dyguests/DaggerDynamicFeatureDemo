package com.fanhl.ddfd.di

import com.fanhl.ddfd.model.Car
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class
    ]
)
interface AppComponent {
    fun car(): Car
}
