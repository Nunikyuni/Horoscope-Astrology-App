package com.example.horoscope.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.horoscope.activity.DetailZodiacActivity
import com.example.horoscope.R
import com.example.horoscope.entity.Zodiac

class ZodiacGridAdapter(private val listZodiac: ArrayList<Zodiac>):RecyclerView.Adapter<ZodiacGridAdapter.ZodiacViewHolder>() {
    inner class ZodiacViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {

    val imgZod =  itemView.findViewById<ImageView>(R.id.imageZodiac)
    val nameZod = itemView.findViewById<TextView>(R.id.textZodiac)

    fun bind (zodiac: Zodiac){
        nameZod.text = zodiac.nameZodiac
        Glide.with(itemView.context)
                .load(zodiac.imgZodiac)
                .apply(RequestOptions().override(350,350))
                .into(imgZod)
        itemView.setOnClickListener {
            val intent = Intent(itemView.context, DetailZodiacActivity::class.java)
            intent.putExtra("Zodiac_Data", zodiac)
            itemView.context.startActivity(intent)
        }
    }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ZodiacViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemzodiac, parent, false)
        return ZodiacViewHolder(view)

    }

    override fun onBindViewHolder(holder: ZodiacViewHolder, position: Int) {
        holder.bind(listZodiac[position])
    }
    override fun getItemCount(): Int = listZodiac.size

}