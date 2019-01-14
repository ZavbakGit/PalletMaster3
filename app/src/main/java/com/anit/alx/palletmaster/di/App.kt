package com.anit.alx.palletmaster.di

import android.app.Application
import android.content.Context


open class App : Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }


    override fun onCreate() {
        super.onCreate()
        initializeDagger()
    }

    private fun initializeDagger() {
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(app = this@App))
            .roomModule(RoomModule())
            .build()
    }

}

