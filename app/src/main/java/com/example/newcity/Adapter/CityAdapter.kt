package com.example.newcity.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newcity.model.City
import com.example.newcity.databinding.CardLayoutBinding
import com.example.newcity.model.Province

class CityAdapter: RecyclerView.Adapter<CityAdapter.CityViewHolder>() {
    var city = mutableListOf<Province>()
    fun setData(city: List<Province>){
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