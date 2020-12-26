package com.example.CleanTemplate.base

import android.app.Application
import com.example.CleanTemplate.di.AppComponent
import com.example.CleanTemplate.di.DaggerAppComponent


import com.example.data.di.NetworkModule


class App:Application() {
    companion object{
        lateinit var appComponent: AppComponent
    }
    override fun onCreate() {
        super.onCreate()
        initDI()
    }

    private fun initDI(){
        appComponent = DaggerAppComponent.builder()
            .networkModule(NetworkModule())
            .build()
    }

}