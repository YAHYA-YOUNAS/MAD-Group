package com.example.assignment_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AmnaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amna)

        val nam = findViewById<TextView>(R.id.name_txt)
        val email = findViewById<TextView>(R.id.email_txt)
        val password = findViewById<TextView>(R.id.pass_txt)

        nam.setText(intent.getStringExtra("nam")).toString()
        email.setText(intent.getStringExtra("email")).toString()
        password.setText(intent.getStringExtra("password")).toString()


    }
}