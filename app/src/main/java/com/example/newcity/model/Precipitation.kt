package com.example.newcity.model


import com.google.gson.annotations.SerializedName

data class Precipitation(
    @SerializedName("_mode")
    val mode: String
)