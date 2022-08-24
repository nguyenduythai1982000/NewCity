package com.example.newcity.model


import com.google.gson.annotations.SerializedName

data class Model(
    @SerializedName("current")
    val current: Current
)