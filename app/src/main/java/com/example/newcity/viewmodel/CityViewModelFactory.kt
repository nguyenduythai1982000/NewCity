package com.example.newcity.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.newcity.CityRepository

class CityViewModelFactory constructor(val repository: CityRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(CityViewModel::class.java)){
            CityViewModel(this.repository) as T
        }else{
            throw IllegalArgumentException("ViewModel Not Found!")
        }
    }

}