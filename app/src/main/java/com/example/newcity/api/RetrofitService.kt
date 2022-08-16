package com.example.newcity.api

import com.example.newcity.Model.City
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {
    @GET("data/2.5/weather")
    fun getAllCities(
        @Query("q") name: String,
        @Query("appid")API_KEY: String
    ): Call<List<City>>

    companion object{
        var retrofitService: RetrofitService? = null

        fun getInstance(): RetrofitService{
            if(retrofitService == null){
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://api.openweathermap.org/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                retrofitService = retrofit.create(RetrofitService::class.java)
            }
            return retrofitService!!
        }
    }
}