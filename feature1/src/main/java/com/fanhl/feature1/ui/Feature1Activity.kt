package com.fanhl.feature1.ui

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.fanhl.arch.BaseActivity
import com.fanhl.ddfd.ARouters
import com.fanhl.ddfd.appComponent
import com.fanhl.ddfd.model.Car
import com.fanhl.feature1.R
import com.fanhl.feature1.di.DaggerFeature1Component
import kotlinx.android.synthetic.main.activity_feature1.*
import javax.inject.Inject

@Route(path = ARouters.Feature1.Feature1)
class Feature1Activity : BaseActivity() {
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature1)
        DaggerFeature1Component.builder()
            .appComponent(appComponent)
            .build()
            .inject(this)

        textView.text = car.wheel.type
    }
}
