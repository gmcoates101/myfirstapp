package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var peopleCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClickMe = findViewById<Button>(R.id.buttonClickMe)
        buttonClickMe.setOnClickListener {
            val textViewName = findViewById<TextView>(R.id.textViewName)
            peopleCount++
            textViewName.text = peopleCount.toString()
            // Toast.makeText(this, "You counted $peopleCount times", Toast.LENGTH_LONG).show()
        }
    }
}