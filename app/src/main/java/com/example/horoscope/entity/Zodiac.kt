package com.example.horoscope.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Zodiac (
    var imgZodiac : Int = 0,
    var loveOpt : String? = null,
    var moneyOpt : String?=null,
    var healthyOpt : String?=null,
    var zodiacMatchOpt : String?=null,
    var tanggal : String? = null,
    var nameZodiac : String? =null

): Parcelable