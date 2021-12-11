package com.example.assignment_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Yahya's Work
        val yButton = findViewById<Button>(R.id.y_btn)

        yButton.setOnClickListener {
            val it = Intent(this, YahyaActivity::class.java)
            it.putExtra("name", "Yahya")
            it.putExtra("age", 20)
            it.putExtra("cgpa", 3.63)
            it.putExtra("status", true)

            startActivity(it)
        }

        // Bilal's Work







        // Amna's Work

    }
}