package com.example.assignment_3


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class BilalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bilal)

        val emp_id = findViewById<TextView>(R.id.id_txt)
        val emp_name = findViewById<TextView>(R.id.emp_name_txt)
        val emp_salary = findViewById<TextView>(R.id.salary_txt)
        val working_hours = findViewById<TextView>(R.id.working_hrs)

        emp_id.setText(intent.getStringExtra("emp_id"))
        emp_name.setText(intent.getStringExtra("emp_name"))
        emp_salary.setText(intent.getDoubleExtra("emp_salary",0.0).toString())
        working_hours.setText(intent.getIntExtra("emp_working_hrs", 0).toString())
    }
}