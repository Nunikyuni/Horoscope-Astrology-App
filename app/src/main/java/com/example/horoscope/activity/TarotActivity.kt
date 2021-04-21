package com.example.horoscope.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.webkit.JsResult
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.Button
import com.example.horoscope.R
import com.example.horoscope.databinding.ActivityTarotBinding

class TarotActivity : AppCompatActivity() {
    private lateinit var webTarot: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tarot)

    webTarot = findViewById(R.id.webViewTarot)
        webTarot.settings.javaScriptEnabled = true
        webTarot.webChromeClient = object : WebChromeClient() {
            override fun onJsAlert(view: WebView?, url: String?, message: String?, result: JsResult?): Boolean {
                result?.confirm()
                return true
            }
        }
        webTarot.loadUrl("https://horoscope-divination.com/daily-tarot/card-of-the-day")

    }
}