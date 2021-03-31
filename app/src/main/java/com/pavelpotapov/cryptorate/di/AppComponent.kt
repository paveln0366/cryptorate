package com.pavelpotapov.cryptorate.di

import com.pavelpotapov.cryptorate.CoinPriceListActivity
import com.pavelpotapov.cryptorate.adapters.CoinInfoAdapter
import dagger.Component
import javax.inject.Singleton

//@Component(modules = [AppModule::class, AdapterModule::class])
@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {
//    fun getAdapter(): CoinInfoAdapter
    fun inject(activity: CoinPriceListActivity)
}