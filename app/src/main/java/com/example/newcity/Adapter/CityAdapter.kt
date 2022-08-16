package com.example.newcity.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newcity.Model.City
import com.example.newcity.databinding.CardLayoutBinding

class CityAdapter: RecyclerView.Adapter<CityAdapter.CityViewHolder>() {
    var city = mutableListOf<City>()
    fun setData(city: List<City>){
        this.city = city.toMutableList()
        notifyDataSetChanged()
    }
    override fun getItemCount(): Int {
        return city.size
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        val cities = city[position]
        holder.binding.itemTitle.text = cities.name
        //Glide.with(holder.itemView.context).load(movie.imageUrl).into(holder.binding.imageview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CardLayoutBinding.inflate(inflater, parent, false)
        return CityViewHolder(binding)
    }
    class CityViewHolder(val binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    }
}