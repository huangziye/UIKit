package com.hzy.uikit

import android.app.Activity
import android.app.Application
import android.os.Bundle

/**
 *
 * @author: ziye_huang
 * @date: 2019/10/24
 */
class NimApp : Application() {

    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks{
            override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {

            }

            override fun onActivityPaused(activity: Activity?) {
            }

            override fun onActivityResumed(activity: Activity?) {
            }

            override fun onActivityStarted(activity: Activity?) {
            }

            override fun onActivityDestroyed(activity: Activity?) {
            }

            override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {
            }

            override fun onActivityStopped(activity: Activity?) {
            }
        })
    }
}