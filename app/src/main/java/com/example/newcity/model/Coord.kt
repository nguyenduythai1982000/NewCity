package com.example.newcity.model


import com.google.gson.annotations.SerializedName

data class Coord(
    @SerializedName("_lat")
    val lat: String,
    @SerializedName("_lon")
    val lon: String
)