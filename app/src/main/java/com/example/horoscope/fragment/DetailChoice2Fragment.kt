package com.example.horoscope.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.horoscope.R

class DetailChoice2Fragment : Fragment() {

    private lateinit var textMessage : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_choice2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val moneyText = arguments?.getString("ZODIAC_MONEY")

        textMessage = view.findViewById(R.id.tv_message_view_2)
        textMessage.text = moneyText.toString()

    }


}