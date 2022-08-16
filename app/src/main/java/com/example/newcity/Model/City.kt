package com.example.newcity.Model


import com.google.gson.annotations.SerializedName

data class City(
    @SerializedName("coord")
    val coord: Coord,
    @SerializedName("country")
    val country: String,
    @SerializedName("_id")
    val id: String,
    @SerializedName("_name")
    val name: String,
    @SerializedName("sun")
    val sun: Sun,
    @SerializedName("timezone")
    val timezone: String
)