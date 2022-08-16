package com.example.newcity.Model


import com.google.gson.annotations.SerializedName

data class Humidity(
    @SerializedName("_unit")
    val unit: String,
    @SerializedName("_value")
    val value: String
)