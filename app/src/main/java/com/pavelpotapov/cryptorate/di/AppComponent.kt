package com.pavelpotapov.cryptorate.di

import com.pavelpotapov.cryptorate.adapters.CoinInfoAdapter
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class, AdapterModule::class])
@Singleton
interface AppComponent {
    fun getAdapter(): CoinInfoAdapter
}