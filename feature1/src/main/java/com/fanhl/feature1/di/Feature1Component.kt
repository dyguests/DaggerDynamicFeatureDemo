package com.fanhl.feature1.di

import com.fanhl.ddfd.di.AppComponent
import com.fanhl.feature1.ui.Feature1Activity
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules = [
        AndroidInjectionModule::class
    ],
    dependencies = [
        AppComponent::class
    ]
)
interface Feature1Component : AndroidInjector<Feature1Activity>