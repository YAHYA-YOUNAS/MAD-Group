package com.example.assignment_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

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
        val sumbit_button = findViewById<Button>(R.id.submit_btn)

        sumbit_button.setOnClickListener {
            val intent = Intent(this,BilalActivity::class.java).apply {
                putExtra("emp_id", "FA-18/BSE/043" )
                putExtra("emp_name", "M B Khan")
                putExtra("emp_salary", 75000.00)
                putExtra("emp_working_hrs", 8)
            }
            startActivity(intent)

        }

        // Amna's Work
        val sub_button = findViewById<Button>(R.id.a_btn)

        sub_button.setOnClickListener {
            val intnt = Intent(this,AmnaActivity::class.java).apply{
                putExtra("name_txt", "Amna Shahbaz")
                putExtra("email_txt", "amnashahbaz@gmail.com")
                putExtra("pass","amna786")

            }
            startActivity(intnt)
        }


    }
}