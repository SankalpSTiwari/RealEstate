package com.example.realestate

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Plus5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plus5)

        var close5Button = findViewById<Button>(R.id.close5button)
        close5Button.setOnClickListener {
            finish() // Close the current activity (second page)
        }
    }
}