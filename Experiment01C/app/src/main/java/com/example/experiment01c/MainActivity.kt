package com.example.experiment01c

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etWeight = findViewById<EditText>(R.id.etWeight)
        val etHeight = findViewById<EditText>(R.id.etHeight)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnCalculate.setOnClickListener {
            if (etWeight.text.isEmpty() || etHeight.text.isEmpty()) return@setOnClickListener

            val weight = etWeight.text.toString().toFloat()
            val heightCm = etHeight.text.toString().toFloat()

            val heightMeter = heightCm / 100
            val bmi = weight / (heightMeter * heightMeter)
            val bmiValue = (bmi * 100).roundToInt() / 100.0

            txtResult.text = "Your BMI: $bmiValue"
        }
    }
}

