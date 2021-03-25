package com.pavelpotapov.cryptorate.pojo

import com.google.gson.JsonObject
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

// Этот объет по ключу RAW сожержит ключ BTC и далее ключ USD
data class CoinPriceInfoRawData(
    @SerializedName("RAW")
    @Expose
    val coinPriceInfoJsonObject: JsonObject? = null
)