package com.fanhl.ddfd

import android.app.Application
import android.os.Parcelable
import androidx.annotation.CheckResult
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.launcher.ARouter

/**
 * 这里存放所有ARouter的跳转Path
 */
object ARouters {
    /**
     * module bizMain
     */
    object Main {
        const val MAIN = "/main/main"
    }

    /**
     * module feature1
     */
    object Feature1 {
        const val Feature1 = "/feature1/feature1"
    }
}

object ARouterApi {
    fun init(application: Application) {
        //        // 这两行必须写在init之前，否则这些配置在init过程中将无效
        //        if (isDebug()) {
        // 打印日志
        ARouter.openLog()
        // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        ARouter.openDebug()
        //        }
        // 尽可能早，推荐在Application中初始化
        ARouter.init(application)
    }
}

fun String.navigation(vararg extras: Pair<String, Any?>) {
    ARouter.getInstance()
        .build(this).apply {
            extras.forEach {
                if (it.second is Parcelable) {
                    withParcelable(it.first, it.second as Parcelable)
                }
                // FIXME: 2019/2/14 fanhl 其它状态还没加
            }
        }
        .navigation()
}

@CheckResult
fun String.navigateFragment(vararg extras: Pair<String, Any?>) = ARouter.getInstance()
    .build(this).apply {
        extras.forEach {
            if (it.second is Parcelable) {
                withParcelable(it.first, it.second as Parcelable)
            }
            // FIXME: 2019/2/14 fanhl 其它状态还没加
        }
    }
    .navigation() as? Fragment ?: throw Exception("未找到对应Fragment，path:$this")