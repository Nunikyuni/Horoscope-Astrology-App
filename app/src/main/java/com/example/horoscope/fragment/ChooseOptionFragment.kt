package com.example.horoscope.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.horoscope.R
import com.example.horoscope.activity.TarotActivity
import com.example.horoscope.entity.Zodiac

class ChooseOptionFragment : Fragment(), View.OnClickListener {

    private  lateinit var loveBtn :Button
    private  lateinit var healthyBtn :Button
    private  lateinit var moneyBtn :Button
    private  lateinit var zodiacMatchBtn :Button
    private  lateinit var tarotButton :Button

    private var loveText: String? = null
    private var moneyText: String? = null
    private var healthyText: String? = null
    private var nameText : String? = null
    private var dataZodiac: Zodiac? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_choose_option, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loveText = arguments?.getString("ZODIAC_LOVE")
        moneyText = arguments?.getString("ZODIAC_MONEY")
        healthyText = arguments?.getString("ZODIAC_HEALTH")
        nameText = arguments?.getString("ZODIAC_NAME")

        loveBtn = view.findViewById(R.id.buttonLove)
        healthyBtn = view.findViewById(R.id.buttonHealthy)
        moneyBtn = view.findViewById(R.id.buttonMoney)
        zodiacMatchBtn = view.findViewById(R.id.buttonZodiacMatch)
        tarotButton = view.findViewById(R.id.buttonTarot)


        loveBtn.setOnClickListener(this)
        healthyBtn.setOnClickListener(this)
        moneyBtn.setOnClickListener(this)
        zodiacMatchBtn.setOnClickListener(this)
        tarotButton.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.buttonLove -> {

                val fragmentManager = fragmentManager
                val detailChoice = DetailChoiceFragment()

                val bundle = Bundle()

                bundle.putString("ZODIAC_LOVE", loveText)
                detailChoice.arguments = bundle

                fragmentManager?.beginTransaction()
                    ?.replace(R.id.idFragment1,detailChoice, DetailChoiceFragment::class.java.simpleName)
                    ?.addToBackStack(null)
                    ?.commit()

            }
            R.id.buttonMoney -> {
                val fragmentManager = fragmentManager
                val detailChoice = DetailChoice2Fragment()

                val bundle = Bundle()

                bundle.putString("ZODIAC_MONEY", moneyText)
                detailChoice.arguments = bundle

                fragmentManager?.beginTransaction()
                    ?.replace(R.id.idFragment1,detailChoice, DetailChoice2Fragment::class.java.simpleName)
                    ?.addToBackStack(null)
                    ?.commit()
            }
            R.id.buttonHealthy -> {
                val fragmentManager = fragmentManager
                val detailChoice = DetailChoice3Fragment()

                val bundle = Bundle()

                bundle.putString("ZODIAC_HEALTH", healthyText)
                detailChoice.arguments = bundle

                fragmentManager?.beginTransaction()
                    ?.replace(R.id.idFragment1,detailChoice, DetailChoice3Fragment::class.java.simpleName)
                    ?.addToBackStack(null)
                    ?.commit()
            }
            R.id.buttonZodiacMatch -> {
                val fragmentManager = fragmentManager
                val matchZodiacFragment = MatchZodiacFragment()

                val bundle = Bundle()

                bundle.putString("ZODIAC_NAME", nameText)
                matchZodiacFragment.arguments = bundle

                fragmentManager?.beginTransaction()
                    ?.replace(R.id.idFragment1,matchZodiacFragment, MatchZodiacFragment::class.java.simpleName)
                    ?.addToBackStack(null)
                    ?.commit()
            }
            R.id.buttonTarot -> {
                val intent = Intent(v.context,TarotActivity::class.java)
                startActivity(intent)

            }
        }
    }



}