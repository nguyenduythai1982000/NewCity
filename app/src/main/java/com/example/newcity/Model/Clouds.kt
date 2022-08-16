package com.example.newcity.Model


import com.google.gson.annotations.SerializedName

data class Clouds(
    @SerializedName("_name")
    val name: String,
    @SerializedName("_value")
    val value: String
)