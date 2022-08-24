package com.example.newcity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.newcity.Adapter.CityAdapter
import com.example.newcity.api.ProvinceService
import com.example.newcity.api.RetrofitService
import com.example.newcity.databinding.ActivityMainBinding
import com.example.newcity.viewmodel.CityViewModel
import com.example.newcity.viewmodel.CityViewModelFactory
import com.example.newcity.viewmodel.ProvinceViewModel
import com.example.newcity.viewmodel.ProvinceViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var viewModel: ProvinceViewModel
    private val retrofitService = ProvinceService.getInstance()
    private val adapter = CityAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this, ProvinceViewModelFactory(ProvinceRepository(retrofitService))).get(ProvinceViewModel::class.java)

        binding.recycler.adapter = adapter
        viewModel.province.observe(this, Observer {
            Log.d("TAG", "onCreate: $it")
            adapter.setData(it)
        })
        viewModel.error.observe(this, Observer {
        })
        viewModel.getAllCities()

    }
}