package com.example.newcity.Model


import com.google.gson.annotations.SerializedName

data class Wind(
    @SerializedName("direction")
    val direction: Direction,
    @SerializedName("gusts")
    val gusts: String,
    @SerializedName("speed")
    val speed: Speed
)