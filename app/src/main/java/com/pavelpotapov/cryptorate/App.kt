package com.pavelpotapov.cryptorate

import android.app.Application
import com.pavelpotapov.cryptorate.di.AdapterModule
import com.pavelpotapov.cryptorate.di.AppComponent
import com.pavelpotapov.cryptorate.di.AppModule
import com.pavelpotapov.cryptorate.di.DaggerAppComponent

class App : Application() {
    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    private fun initDagger() {
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(context = this@App))
            .adapterModule(AdapterModule())
            .build()
    }
}