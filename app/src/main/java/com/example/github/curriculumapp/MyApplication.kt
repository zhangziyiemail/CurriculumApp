package com.example.github.curriculumapp

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 *   Created by zhangziyi on 9/9/20 16:25
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = applicationContext
    }

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var instance: Context

    }
}