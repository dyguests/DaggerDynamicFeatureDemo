package com.fanhl.ddfd.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Wheel @Inject constructor() {
    val type = "宝马的轮胎${System.currentTimeMillis()}"
}