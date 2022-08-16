package com.example.newcity.Model


import com.google.gson.annotations.SerializedName

data class Current(
    @SerializedName("city")
    val city: City,
    @SerializedName("clouds")
    val clouds: Clouds,
    @SerializedName("feels_like")
    val feelsLike: FeelsLike,
    @SerializedName("humidity")
    val humidity: Humidity,
    @SerializedName("lastupdate")
    val lastupdate: Lastupdate,
    @SerializedName("precipitation")
    val precipitation: Precipitation,
    @SerializedName("pressure")
    val pressure: Pressure,
    @SerializedName("temperature")
    val temperature: Temperature,
    @SerializedName("visibility")
    val visibility: Visibility,
    @SerializedName("weather")
    val weather: Weather,
    @SerializedName("wind")
    val wind: Wind
)