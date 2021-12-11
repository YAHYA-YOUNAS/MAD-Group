package com.example.assignment_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class YahyaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yahya)

        val nameText = findViewById<TextView>(R.id.name_txt)
        val ageText = findViewById<TextView>(R.id.age_txt)
        val cgpaText = findViewById<TextView>(R.id.cgpa_txt)
        val statusText = findViewById<TextView>(R.id.status_txt)

        val intentName = intent.getStringExtra("name")
        val intentAge = intent.getIntExtra("age", 0)
        val intentCgpa = intent.getDoubleExtra("cgpa", 0.0)
        val intentStatus = intent.getBooleanExtra("status", false)

        nameText.setText(intentName.toString())
        ageText.setText(intentAge.toString())
        cgpaText.setText(intentCgpa.toString())
        statusText.setText(intentStatus.toString())

    }
}