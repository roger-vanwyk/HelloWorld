package com.example.roger.helloworld

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/*
* Created by Roger Van Wyk on 14 Jan 2021 as a Curriculum Vitae & Applications Portfolio.
*
* Android Java Nanodegree obtained through a grant from African App Launchpad & Google.
*
* HTML, CSS, JavaScript at freeCodeCamp, responsive web design at Udemy,
* and Ruby + Ruby-on-Rails at The Odin Project.
*
* Google Online Marketing Fundamentals at Google Tech for Africa.
*
* I am hoping to start a career in tech, coming from a military aviation environment,
* as a senior air traffic controller, air traffic services instructor, and aviation safety officer.
*
* Email: roger.vanwyk@gmail.com
*
* */
abstract class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // gets reference to image view named categoryOnePortfolio
        val categoryOnePortfolio = findViewById<ImageView>(R.id.categoryOnePortfolio)

// sets on-click listener for image view named categoryOnePortfolio
        categoryOnePortfolio.setOnClickListener {

            // opens PortfolioActivity
            val intentToPortfolio = Intent(this, PortfolioActivity::class.java)
            startActivity(intentToPortfolio)
            Toast.makeText(this@MainActivity, "Portfolio", Toast.LENGTH_SHORT).show()
        }

        // gets reference to image view named categoryTwoProfile
        val categoryTwoProfile = findViewById<ImageView>(R.id.categoryTwoProfile)

// sets on-click listener for image view named categoryTwoProfile
        categoryTwoProfile.setOnClickListener {

            // opens ProfileActivity
            val intentToProfile = Intent(this, ProfileActivity::class.java)
            startActivity(intentToProfile)
            Toast.makeText(this@MainActivity, "Profile", Toast.LENGTH_SHORT).show()
        }

// gets reference to image view named categoryThreeQualification
        val categoryThreeQualification = findViewById<ImageView>(R.id.categoryThreeQualification)

// sets on-click listener for image view named categoryThreeQualification
        categoryThreeQualification.setOnClickListener {

            // opens QualificationActivity
            val intentToQualification = Intent(this, QualificationActivity::class.java)
            startActivity(intentToQualification)
            Toast.makeText(this@MainActivity, "Qualification", Toast.LENGTH_SHORT).show()
        }

        // gets reference to image view named categoryFourCareer
        val categoryFourCareer = findViewById<ImageView>(R.id.categoryFourCareer)

// sets on-click listener for image view named categoryFourCareer
        categoryFourCareer.setOnClickListener {

            // opens QualificationActivity
            val intentToCareer = Intent(this, CareerActivity::class.java)
            startActivity(intentToCareer)
            Toast.makeText(this@MainActivity, "Career", Toast.LENGTH_SHORT).show()
        }
    }
}