package com.example.newcity.Model


import com.google.gson.annotations.SerializedName

data class Pressure(
    @SerializedName("_unit")
    val unit: String,
    @SerializedName("_value")
    val value: String
)