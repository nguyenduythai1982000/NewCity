package com.example.newcity.api

import com.example.newcity.model.City
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


interface RetrofitService {
    @GET("geo/1.0/direct?q=&limit=&appid=")
    fun getAllCities(
        @Query("q") name: String,
        @Query("limit") limit: Int,
        @Query("appid")API_KEY: String
    ): Call<List<City>>

    companion object{
        var retrofitService: RetrofitService? = null
        const val API_KEY = "bbf2282377b20d1781e8faf0457fb6fe"
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