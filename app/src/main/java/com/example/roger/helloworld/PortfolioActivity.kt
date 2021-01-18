package com.example.roger.helloworld

import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PortfolioActivity(var webView: Any) : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portfolio)

        // gets reference to image view named prjtOneAndroid
        val prjtOneAndroid = findViewById<ImageView>(R.id.prjtOneAndroid)

        // sets on-click listener for image view named prjtOneAndroid
        prjtOneAndroid.setOnClickListener {

            // opens prjtOneAndroid web url
            webView.Uri("https://bit.ly/Webflix")
            Toast.makeText(this@PortfolioActivity, "Android Project One", Toast.LENGTH_SHORT).show()
        }

        // gets reference to image view named prjtTwoAndroid
        val prjtTwoAndroid = findViewById<ImageView>(R.id.prjtTwoAndroid)

        // sets on-click listener for image view named prjtTwoAndroid
        prjtTwoAndroid.setOnClickListener {

            // opens prjtTwoAndroid web url
            webView.Uri("https://bit.ly/UdacityLearning")
            Toast.makeText(this@PortfolioActivity, "Android Project Two", Toast.LENGTH_SHORT).show()
        }

        // gets reference to image view named prjtThreeAndroid
        val prjtThreeAndroid = findViewById<ImageView>(R.id.prjtThreeAndroid)

        // sets on-click listener for image view named prjtThreeAndroid
        prjtThreeAndroid.setOnClickListener {

            // opens prjtThreeAndroid web url
            webView.Uri("https://bit.ly/PilotDemo")
            Toast.makeText(this@PortfolioActivity, "Android Project Three", Toast.LENGTH_SHORT).show()
        }

        // gets reference to image view named prjtOneWeb
        val prjtOneWeb = findViewById<ImageView>(R.id.prjtOneWeb)

        // sets on-click listener for image view named prjtOneWeb
        prjtOneWeb.setOnClickListener {

            // opens prjtOneWeb web url
            Uri.parse("https://codepen.io/rogervw84/full/JgrVgW/").also {
                Toast.makeText(this@PortfolioActivity, "Web Project One", Toast.LENGTH_SHORT).show()
            }

            // gets reference to image view named prjtTwoWeb
            val prjtTwoWeb = findViewById<ImageView>(R.id.prjtTwoWeb)

            // sets on-click listener for image view named prjtTwoWeb
            prjtTwoWeb.setOnClickListener {

                // opens prjtTwoWeb web url
                Uri.parse("https://codepen.io/rogervw84/full/ZEERqmX").also {
                    Toast.makeText(this@PortfolioActivity, "Web Project Two", Toast.LENGTH_SHORT).show()
                }

                // gets reference to image view named prjtThreeWeb
                val prjtThreeWeb = findViewById<ImageView>(R.id.prjtThreeWeb)

                // sets on-click listener for image view named prjtThreeWeb
                prjtThreeWeb.setOnClickListener {

                    // opens prjtThreeWeb web url
                    Uri.parse("https://codepen.io/rogervw84/full/")
                    Toast.makeText(this@PortfolioActivity, "Web Project Three", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}

private fun Any.Uri(s: String) {
    TODO("Not yet implemented")
}