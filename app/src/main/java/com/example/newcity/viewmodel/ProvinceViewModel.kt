package com.example.newcity.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newcity.ProvinceRepository
import com.example.newcity.model.City
import com.example.newcity.model.Province
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProvinceViewModel constructor(val repository: ProvinceRepository): ViewModel() {
    var province = MutableLiveData<List<Province>>()
    var error = MutableLiveData<String>()
    fun getAllCities(){
        val response = repository.getCity()
        response.enqueue(object : Callback<List<Province>?> {
            override fun onResponse(
                call: Call<List<Province>?>,
                response: Response<List<Province>?>
            ) {
                province.postValue(response.body())
            }

            override fun onFailure(call: Call<List<Province>?>, t: Throwable) {
                error.postValue(t.message)
            }
        })
    }
}