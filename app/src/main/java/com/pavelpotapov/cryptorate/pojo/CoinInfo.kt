package com.pavelpotapov.cryptorate.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

// Этот объет содержит информацию о валюте
data class CoinInfo (
    @SerializedName("Id")
    @Expose
    val id: String? = null,

    @SerializedName("Name")
    @Expose
    val name: String? = null,

    @SerializedName("FullName")
    @Expose
    val fullName: String? = null,

    @SerializedName("ImageUrl")
    @Expose
    val imageUrl: String? = null
)