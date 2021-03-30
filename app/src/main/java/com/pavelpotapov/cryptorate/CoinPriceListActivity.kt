package com.pavelpotapov.cryptorate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.pavelpotapov.cryptorate.adapters.CoinInfoAdapter
import com.pavelpotapov.cryptorate.adapters.CoinInfoAdapter_Factory.create
import com.pavelpotapov.cryptorate.di.AppModule
import com.pavelpotapov.cryptorate.di.DaggerAppComponent
import com.pavelpotapov.cryptorate.pojo.CoinPriceInfo
import kotlinx.android.synthetic.main.activity_coin_price_list.*
import javax.inject.Inject

class CoinPriceListActivity : AppCompatActivity() {

    private lateinit var viewModel: CoinViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_coin_price_list)
//        val adapter = CoinInfoAdapter(this)

        val component = DaggerAppComponent.builder().appModule(AppModule(this)).build()
        val adapter = component.getAdapter()

        adapter.onCoinClickListener = object : CoinInfoAdapter.OnCoinClickListener {
            override fun onCoinClick(coinPriceInfo: CoinPriceInfo) {
                val intent = CoinDetailActivity.newIntent(
                    this@CoinPriceListActivity,
                    coinPriceInfo.fromSymbol
                )
                startActivity(intent)
            }
        }
        rvCoinPriceList.adapter = adapter
        viewModel = ViewModelProviders.of(this)[CoinViewModel::class.java]
        viewModel.priceList.observe(this, Observer {
            adapter.coinInfoList = it
        })
    }
}
