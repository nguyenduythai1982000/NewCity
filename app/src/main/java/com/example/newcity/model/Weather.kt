package com.example.newcity.model


import com.google.gson.annotations.SerializedName

data class Weather(
    @SerializedName("_icon")
    val icon: String,
    @SerializedName("_number")
    val number: String,
    @SerializedName("_value")
    val value: String
)