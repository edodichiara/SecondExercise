package com.example.secondexercise

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.get
import androidx.core.view.size
import androidx.recyclerview.widget.RecyclerView

class ArtViewHolder(view : View) : RecyclerView.ViewHolder (view){
    val artName : TextView
    val artImage : ImageView

    init {
        artName = view.findViewById(R.id.art_name)
        artImage = view.findViewById(R.id.art_image)
    }
}

class ArtAdapter(private val arts : List<Art>) : RecyclerView.Adapter<ArtViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtViewHolder {
        val artView = LayoutInflater.from(parent.context).inflate(R.layout.art_list_item, parent, false)
        return ArtViewHolder(artView)
    }

    override fun onBindViewHolder(holder: ArtViewHolder, position: Int) {
        holder.artName.text = arts[position].name
        //holder.artImage.id = arts[position].image
        holder.artImage.setImageResource(arts[position].image)
    }

    override fun getItemCount(): Int {
        return arts.size
    }
}