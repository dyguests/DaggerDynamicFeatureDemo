package com.fanhl.feature1.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.fanhl.ddfd.ARouters
import com.fanhl.feature1.R

@Route(path = ARouters.Feature1.Feature1)
class Feature1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature1)
    }
}
