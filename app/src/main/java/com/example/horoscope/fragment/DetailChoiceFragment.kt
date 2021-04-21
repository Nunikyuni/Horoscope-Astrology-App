package com.example.horoscope.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.horoscope.R

class DetailChoiceFragment : Fragment() {

    private lateinit var textMessage : TextView
    private lateinit var imgBack : ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_choice, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val loveText = arguments?.getString("ZODIAC_LOVE")

        textMessage = view.findViewById(R.id.tv_message)
        textMessage.text = loveText.toString()

    }


}