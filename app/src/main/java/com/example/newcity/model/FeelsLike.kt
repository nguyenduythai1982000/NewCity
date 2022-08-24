package com.example.newcity.model


import com.google.gson.annotations.SerializedName

data class FeelsLike(
    @SerializedName("_unit")
    val unit: String,
    @SerializedName("_value")
    val value: String
)