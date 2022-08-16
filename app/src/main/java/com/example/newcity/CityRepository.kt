package com.example.newcity

import com.example.newcity.api.RetrofitService

class CityRepository constructor(val retrofitService: RetrofitService) {
    fun getAllCities() = retrofitService.getAllCities("London","api_key")
}