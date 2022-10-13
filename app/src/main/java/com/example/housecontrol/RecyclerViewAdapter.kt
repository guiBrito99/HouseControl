package com.example.housecontrol

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(var data: ArrayList<ArtificialSunData>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item,
            parent,false)

        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size;
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(values: ArtificialSunData) {
            itemView.findViewById<TextView>(R.id.sunrise_info_day_value).text = values.weekDay
            itemView.findViewById<TextView>(R.id.sunrise_info_hour_value).text = values.hour
            itemView.findViewById<TextView>(R.id.sunrise_info_type_value).text = values.type
            itemView.findViewById<TextView>(R.id.sunrise_info_location_value).text = values.location
        }
    }

}