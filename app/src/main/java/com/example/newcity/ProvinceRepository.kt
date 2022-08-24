package com.example.newcity

import com.example.newcity.api.ProvinceService

class ProvinceRepository constructor(private val provinceService: ProvinceService) {
    fun getCity() = provinceService.getCity("")
}