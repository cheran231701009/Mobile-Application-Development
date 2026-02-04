package com.example.experiment01

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var textSize = 20f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtHello = findViewById<TextView>(R.id.txtHello)
        val btnSize = findViewById<Button>(R.id.btnSize)
        val btnColor = findViewById<Button>(R.id.btnColor)
        val btnBg = findViewById<Button>(R.id.btnBg)
        val mainLayout = findViewById<LinearLayout>(R.id.mainLayout)

        btnSize.setOnClickListener {
            textSize += 2f
            txtHello.textSize = textSize
        }

        btnColor.setOnClickListener {
            txtHello.setTextColor(Color.RED)
        }

        btnBg.setOnClickListener {
            mainLayout.setBackgroundColor(Color.YELLOW)
        }
    }
}




