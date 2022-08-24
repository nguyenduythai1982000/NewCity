package com.example.newcity.model

import com.example.newcity.ProvinceRepository

data class Province(
    val name: String,
    val code: Int,
    val division_type: String,
    val codename: String,
)