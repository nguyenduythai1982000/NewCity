package com.example.newcity.Model


import com.google.gson.annotations.SerializedName

data class Precipitation(
    @SerializedName("_mode")
    val mode: String
)