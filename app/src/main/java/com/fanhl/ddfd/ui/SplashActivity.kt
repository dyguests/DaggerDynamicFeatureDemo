package com.fanhl.ddfd.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fanhl.ddfd.ARouters
import com.fanhl.ddfd.R
import com.fanhl.ddfd.navigation
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        btn_navigation.setOnClickListener {
            ARouters.Feature1.Feature1.navigation()
        }
    }
}
