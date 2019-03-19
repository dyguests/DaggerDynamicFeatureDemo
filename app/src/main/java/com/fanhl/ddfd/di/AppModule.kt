package com.fanhl.ddfd.di

import com.fanhl.ddfd.model.Car
import com.fanhl.ddfd.model.Wheel
import dagger.Module
import dagger.Provides

@Module
internal class AppModule {
    @Provides
    fun provideCar(wheel: Wheel) = Car(wheel)
}