package com.example.horoscope.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.horoscope.R
import com.example.horoscope.databinding.ActivityDetailZodiacBinding
import com.example.horoscope.entity.Zodiac

class DetailZodiacActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailZodiacBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_zodiac)
        binding = ActivityDetailZodiacBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataZodiac = intent.getParcelableExtra<Zodiac>("Zodiac_Data")
        binding.dateZodiac.text = dataZodiac?.tanggal.toString()
        binding.nameZodiac.text = dataZodiac?.nameZodiac.toString()
        binding.backIcon.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        Glide.with(this)
            .load(dataZodiac?.imgZodiac)
            .apply(RequestOptions().override(450,450))
            .into(binding.zodiacImg)
        binding.buttonDetail.setOnClickListener {
            val intent = Intent(this, ChooseOptionActivity::class.java)
            intent.putExtra("Zodiac_Data", dataZodiac)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

}