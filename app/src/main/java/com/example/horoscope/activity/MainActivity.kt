package com.example.horoscope.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.horoscope.adapter.ZodiacGridAdapter
import com.example.horoscope.databinding.ActivityMainBinding
import com.example.horoscope.entity.ZodiacData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var zodiacAdapter: ZodiacGridAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.RecView.layoutManager = GridLayoutManager(this, 3)
        zodiacAdapter = ZodiacGridAdapter(ZodiacData.listZodiac)
        binding.RecView.adapter = zodiacAdapter
    }
    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

}