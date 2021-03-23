package com.pavelpotapov.cryptorate.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

// Этот объет содержит информацию о валюте
data class CoinInfo (
    @SerializedName("Name")
    @Expose
    val name: String? = null
)