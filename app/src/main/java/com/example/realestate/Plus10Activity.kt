package com.example.realestate

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Plus10Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plus10)

        var close10Button = findViewById<Button>(R.id.close10button)
        close10Button.setOnClickListener {
            finish() // Close the current activity (second page)
        }
    }
}