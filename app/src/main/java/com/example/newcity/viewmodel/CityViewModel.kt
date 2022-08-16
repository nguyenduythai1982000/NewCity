package com.example.newcity.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newcity.CityRepository
import com.example.newcity.Model.City
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CityViewModel constructor(val repository: CityRepository): ViewModel() {
    val cityList = MutableLiveData<List<City>>()
    val error = MutableLiveData<String>()

    fun getAllCities(){
        val response = repository.getAllCities()
        response.enqueue(object : Callback<List<City>?> {
            override fun onResponse(call: Call<List<City>?>, response: Response<List<City>?>) {
                cityList.postValue(response.body())
            }

            override fun onFailure(call: Call<List<City>?>, t: Throwable) {
                error.postValue(t.message)
            }
        })
    }

}