package com.example.newcity.api

import com.example.newcity.model.Province
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ProvinceService {
    @GET("/api/p/")
    fun getCity(
        @Query("p") name: String
    ): Call<List<Province>>

    companion object {
        var retrofitService: ProvinceService? = null

        //const val API_KEY = "bbf2282377b20d1781e8faf0457fb6fe"
        fun getInstance(): ProvinceService {
            if (retrofitService == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://provinces.open-api.vn")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                retrofitService = retrofit.create(ProvinceService::class.java)
            }
            return retrofitService!!
        }
    }
}