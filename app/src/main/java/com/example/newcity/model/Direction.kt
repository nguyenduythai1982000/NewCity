package com.example.newcity.model


import com.google.gson.annotations.SerializedName

data class Direction(
    @SerializedName("_code")
    val code: String,
    @SerializedName("_name")
    val name: String,
    @SerializedName("_value")
    val value: String
)