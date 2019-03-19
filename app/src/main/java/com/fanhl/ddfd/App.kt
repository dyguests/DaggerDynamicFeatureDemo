package com.fanhl.ddfd

import android.app.Application
import com.fanhl.arch.BaseActivity
import com.fanhl.ddfd.di.AppComponent
import com.fanhl.ddfd.di.DaggerAppComponent

class App : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        initARouter()
        initDagger()
    }

    private fun initARouter() {
        ARouterApi.init(this)
    }

    private fun initDagger() {
        appComponent = DaggerAppComponent.create()
    }
}

val BaseActivity.app: App
    get() {
        return application as App
    }

val BaseActivity.appComponent: AppComponent
    get() {
        return app.appComponent
    }
