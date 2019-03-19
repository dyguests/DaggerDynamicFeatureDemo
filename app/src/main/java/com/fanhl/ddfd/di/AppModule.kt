package com.fanhl.ddfd.di

import com.fanhl.ddfd.model.Car
import com.fanhl.ddfd.model.Wheel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal class AppModule {
    @Singleton
    @Provides
    fun provideCar(wheel: Wheel) = Car(wheel)
}