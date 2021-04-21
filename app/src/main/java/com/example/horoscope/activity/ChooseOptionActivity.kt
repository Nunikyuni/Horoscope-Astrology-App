package com.example.horoscope.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.horoscope.R
import com.example.horoscope.entity.Zodiac
import com.example.horoscope.fragment.ChooseOptionFragment

class ChooseOptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_option)

        val dataZodiac = intent.getParcelableExtra<Zodiac>("Zodiac_Data") as Zodiac


        val chooseFragment = ChooseOptionFragment()

        val bundle = Bundle()

        bundle.putString("ZODIAC_LOVE", dataZodiac.loveOpt)
        bundle.putString("ZODIAC_HEALTH", dataZodiac.healthyOpt)
        bundle.putString("ZODIAC_MONEY", dataZodiac.moneyOpt)
        bundle.putString("ZODIAC_NAME", dataZodiac.nameZodiac)

        chooseFragment.arguments = bundle

            supportFragmentManager.beginTransaction()
                .add(R.id.idFragment1, chooseFragment, ChooseOptionFragment::class.java.simpleName)
                .commit()
    }
}