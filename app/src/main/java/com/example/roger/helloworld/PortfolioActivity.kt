package com.example.roger.helloworld

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.webkit.WebViewClient
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PortfolioActivity(var webView: Any) : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portfolio)
        var webView = findViewById(R.id.webEmulatorView)
        webView.settings.setJavaScriptEnabled(true)

        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        // gets reference to image view named prjtOneAndroid
        val prjtOneAndroid = findViewById<ImageView>(R.id.prjtOneAndroid)
        // sets on-click listener for image view named prjtOneAndroid
        prjtOneAndroid.setOnClickListener {
            // opens prjtOneAndroid web url
            webview.loadUrl("https://appetize.io/embed/4cw1pw99keqnkj4wvawgvpkuxr?device=nexus5&autoplay=true&scale=60&orientation=portrait&osVersion=8.1")
            Toast.makeText(this@PortfolioActivity, "Android Project One", Toast.LENGTH_SHORT).show()
        }
        // gets reference to image view named prjtTwoAndroid
        val prjtTwoAndroid = findViewById<ImageView>(R.id.prjtTwoAndroid)
        // sets on-click listener for image view named prjtTwoAndroid
        prjtTwoAndroid.setOnClickListener {
            // opens prjtTwoAndroid web url
            val webview = null
            webview.loadUrl("https://appetize.io/embed/ua3tc4g5jfd2xrmnd15w7yx3zr?device=nexus5&autoplay=true&scale=60&orientation=portrait&osVersion=8.1")
            Toast.makeText(this@PortfolioActivity, "Android Project Two", Toast.LENGTH_SHORT).show()
        }
        // gets reference to image view named prjtThreeAndroid
        val prjtThreeAndroid = findViewById<ImageView>(R.id.prjtThreeAndroid)
        // sets on-click listener for image view named prjtThreeAndroid
        prjtThreeAndroid.setOnClickListener {
            // opens prjtThreeAndroid web url
            val webview = null
            webview.loadUrl("https://appetize.io/embed/66yb7abk8wuf458uk2nzcwm3x4?device=nexus5&autoplay=true&scale=60&orientation=portrait&osVersion=8.1")
            Toast.makeText(this@PortfolioActivity, "Android Project Three", Toast.LENGTH_SHORT).show()
        }
        // gets reference to image view named prjtOneWeb
        val prjtOneWeb = findViewById<ImageView>(R.id.prjtOneWeb)
        // sets on-click listener for image view named prjtOneWeb
        prjtOneWeb.setOnClickListener {
            // opens prjtOneWeb web url
            val openURL = Intent(android.context.intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://codepen.io/rogervw84/full/JgrVgW/")
            Toast.makeText(this@PortfolioActivity, "Web Project One", Toast.LENGTH_SHORT).show()
        }
        // gets reference to image view named prjtTwoWeb
        val prjtTwoWeb = findViewById<ImageView>(R.id.prjtTwoWeb)
        // sets on-click listener for image view named prjtTwoWeb
        prjtTwoWeb.setOnClickListener {
            // opens prjtTwoWeb web url
            val openURL = Intent(android.context.intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://codepen.io/rogervw84/full/ZEERqmX")
            Toast.makeText(this@PortfolioActivity, "Web Project Two", Toast.LENGTH_SHORT).show()
        }
        // gets reference to image view named prjtThreeWeb
        val prjtThreeWeb = findViewById<ImageView>(R.id.prjtThreeWeb)
        // sets on-click listener for image view named prjtThreeWeb
        prjtThreeWeb.setOnClickListener {
            // opens prjtThreeWeb web url
            val openURL = Intent(android.context.intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://codepen.io/rogervw84/full/")
            Toast.makeText(this@PortfolioActivity, "Web Project Three", Toast.LENGTH_SHORT).show()
        }
    }
}