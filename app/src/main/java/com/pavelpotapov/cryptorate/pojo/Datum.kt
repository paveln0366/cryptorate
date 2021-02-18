package com.pavelpotapov.cryptorate.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

// Этот объет содержит объект CoinInfo
data class Datum (
    @SerializedName("CoinInfo")
    @Expose
    val coinInfo: CoinInfo? = null
)