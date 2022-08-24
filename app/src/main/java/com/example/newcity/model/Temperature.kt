package com.example.newcity.model


import com.google.gson.annotations.SerializedName

data class Temperature(
    @SerializedName("_max")
    val max: String,
    @SerializedName("_min")
    val min: String,
    @SerializedName("_unit")
    val unit: String,
    @SerializedName("_value")
    val value: String
)