package com.example.newcity.model


import com.google.gson.annotations.SerializedName

data class Sun(
    @SerializedName("_rise")
    val rise: String,
    @SerializedName("_set")
    val `set`: String
)