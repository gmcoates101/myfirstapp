package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var peopleCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewName = findViewById<TextView>(R.id.textViewName)
        textViewName.text = peopleCount.toString()

        val buttonClickMe = findViewById<Button>(R.id.buttonClickMe)
        buttonClickMe.setOnClickListener {

            peopleCount++
            textViewName.text = peopleCount.toString()

            if (peopleCount % 10 == 0) {
                Toast.makeText(this, "You counted $peopleCount times", Toast.LENGTH_SHORT).show()
            }
        }
    }
}