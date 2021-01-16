package com.example.roger.helloworld

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/*
* Created by Roger Van Wyk on 14 Jan 2021 as a Curriculum Vitae & Applications Portfolio.
*
* Android Java Nanodegree obtained through a grant from African App Launchpad & Google.
* Responsive Web Design at Udemy.
* Google Online Marketing Fundamentals at Google Tech for Africa.
*
* I am hoping to start a career in tech, coming from a military aviation environment,
* as a senior air traffic controller, air traffic services instructor, and aviation safety officer.
*
* Email: roger.vanwyk@gmail.com
*
* */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // gets reference to image view named categoryOneImg
        val categoryOneImg = findViewById<ImageView>(R.id.categoryOneImg)
        // sets on-click listener for image view named categoryOneImg
        categoryOneImg.setOnClickListener {
            // creates a new intent named categoryOneInt
            val categoryOneInt = Intent(this, PortfolioActivity::class.java)
            // starts new activity, PortfolioActivity
            startActivity(categoryOneInt)
            Toast.makeText(this@MainActivity, "Category One", Toast.LENGTH_SHORT).show()
        }
        // gets reference to image view named categoryTwoImg
        val categoryTwoImg = findViewById<ImageView>(R.id.categoryTwoImg)
        // sets on-click listener for image view named categoryTwoImg
        categoryTwoImg.setOnClickListener {
            // creates a new intent named categoryTwoInt
            val categoryTwoInt = Intent(this, ProfileActivity::class.java)
            // starts new activity, ProfileActivity
            startActivity(categoryTwoInt)
            Toast.makeText(this@MainActivity, "Category Two", Toast.LENGTH_SHORT).show()
        }
        // gets reference to image view named categoryThreeImg
        val categoryThreeImg = findViewById<ImageView>(R.id.categoryThreeImg)
        // sets on-click listener to image view named categoryThreeImg
        categoryThreeImg.setOnClickListener {
            // creates a new intent named categoryThreeInt
            val categoryThreeInt = Intent(this, QualificationActivity::class.java)
            // starts new activity, QualificationActivity
            startActivity(categoryThreeInt)
            Toast.makeText(this@MainActivity, "Category Three", Toast.LENGTH_SHORT).show()
        }
        // gets reference to image view named categoryFourImg
        val categoryFourImg = findViewById<ImageView>(R.id.categoryFourImg)
        // sets on-click listener for image view named categoryThreeImg
        categoryFourImg.setOnClickListener {
            // creates a new intent named categoryFourInt
            val categoryFourInt = Intent(this, CareerActivity::class.java)
            // starts new activity, CareerActivity
            startActivity(categoryFourInt)
            Toast.makeText(this@MainActivity, "Category Four", Toast.LENGTH_SHORT).show()
        }
    }
}