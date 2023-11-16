package com.example.generationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var yearInput : TextView? = null
    private var resultText : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        yearInput = findViewById(R.id.yearInput)
        resultText = findViewById(R.id.resultText)

        val btnGenerate = findViewById<Button>(R.id.btnGenerate)

        btnGenerate.setOnClickListener {
            checkGeneration()
        }

    }

    private fun checkGeneration(){

        when (yearInput?.text.toString().trim().toInt()){
            in 1901..1927 -> resultText?.text = "The Greatest Generation"
            in 1926..1945 -> resultText?.text = "The Silent Generation"
            in 1946..1964 -> resultText?.text = "The Baby Boomer Generation"
            in 1965..1980 -> resultText?.text = "Generation X"
            in 1981..1996 -> resultText?.text = "Millenials"
            in 1997..2012 -> resultText?.text = "Gen Z"
            in 2013..2025 -> resultText?.text = "Gen Alpha"

            else ->{
                resultText?.text = "Alien! Birth date is not valid"
            }
        }
    }
}