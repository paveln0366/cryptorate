package com.pavelpotapov.cryptorate.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

// Из сети получаем этот объект со списком самых популярных валют
data class CoinInfoListOfData(
    @SerializedName("Data")
    @Expose
    val data: List<Datum>? = null
)