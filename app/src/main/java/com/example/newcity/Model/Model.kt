package com.example.newcity.Model


import com.google.gson.annotations.SerializedName

data class Model(
    @SerializedName("current")
    val current: Current
)