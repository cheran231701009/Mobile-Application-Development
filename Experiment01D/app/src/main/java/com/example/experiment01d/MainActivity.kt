package com.example.experiment01d

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etTemp = findViewById<EditText>(R.id.etTemp)
        val btnCelsius = findViewById<Button>(R.id.btnCelsius)
        val btnFahrenheit = findViewById<Button>(R.id.btnFahrenheit)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnCelsius.setOnClickListener {
            if (etTemp.text.isEmpty()) {
                txtResult.text = "Please enter the temperature"
            } else {
                val f = etTemp.text.toString().toFloat()
                val c = (f - 32) * 5 / 9
                txtResult.text = c.toString()
            }
        }

        btnFahrenheit.setOnClickListener {
            if (etTemp.text.isEmpty()) {
                txtResult.text = "Please enter the temperature"
            } else {
                val c = etTemp.text.toString().toFloat()
                val f = (c * 9 / 5) + 32
                txtResult.text = f.toString()
            }
        }

        btnClear.setOnClickListener {
            etTemp.text.clear()
            txtResult.text = ""
        }
    }
}
