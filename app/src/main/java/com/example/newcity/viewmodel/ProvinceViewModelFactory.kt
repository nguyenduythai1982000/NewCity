package com.example.newcity.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.newcity.ProvinceRepository

@Suppress("UNCHECKED_CAST")
class ProvinceViewModelFactory constructor(val repository: ProvinceRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if(modelClass.isAssignableFrom(ProvinceViewModel::class.java)){
            ProvinceViewModel(this.repository) as T
        }else{
            throw IllegalArgumentException("View Model Not Found!")
        }
    }

}