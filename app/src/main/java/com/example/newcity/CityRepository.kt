package com.example.newcity

import com.example.newcity.api.RetrofitService
import com.example.newcity.api.RetrofitService.Companion.API_KEY

class CityRepository constructor(val retrofitService: RetrofitService) {
    fun getAllCities() = retrofitService.getAllCities("London",1, API_KEY)
}