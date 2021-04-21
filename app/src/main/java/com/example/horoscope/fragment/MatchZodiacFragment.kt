package com.example.horoscope.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.example.horoscope.R
import java.util.*


class MatchZodiacFragment : Fragment() {


    private lateinit var btnMatchZodiacFragment: Button
    private lateinit var spinner: Spinner
    private lateinit var spinner2: Spinner
    private lateinit var hasilZodiacMatch: TextView


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_match_zodiac, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        spinner = view.findViewById(R.id.spinnerZodiac)
        spinner2 = view.findViewById(R.id.spinnerZodiac2)
        btnMatchZodiacFragment = view.findViewById(R.id.button)
        hasilZodiacMatch = view.findViewById(R.id.tv_match)

        ArrayAdapter.createFromResource(
                view.context,
                R.array.name_zodiac,
                android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
            spinner2.adapter = adapter
        }

        btnMatchZodiacFragment.setOnClickListener {
            val random = Random().nextInt(100)
            hasilZodiacMatch.text = "Result : $random %"
        }
    }
}