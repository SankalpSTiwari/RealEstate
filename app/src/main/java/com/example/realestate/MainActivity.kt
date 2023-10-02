package com.example.realestate

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var cnt = 0

    var tv: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.textView)
        val showDialogButton = findViewById<Button>(R.id.dialogButton)
        val closeAppButton = findViewById<Button>(R.id.closeAppButton)

        showDialogButton.setOnClickListener {
            showCustomDialog()
        }

        val b1 = findViewById<Button>(R.id.plus5)
        b1.setOnClickListener{
            cnt += 5

            val intent = Intent(this, Plus5Activity::class.java)
            startActivity(intent)
        }

        val b2 = findViewById<Button>(R.id.plus10)
        b2.setOnClickListener{
            cnt += 10
            val intent = Intent(this, Plus10Activity::class.java)
            startActivity(intent)
        }

        closeAppButton.setOnClickListener {
            // Close the application when the "Close App" button is clicked
            finishAffinity()
        }
    }

    private fun showCustomDialog() {
        // Create a dialog
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_layout)

        // Find the close button inside the dialog
        val closeButton = dialog.findViewById<Button>(R.id.closeDialogButton)

        closeButton.setOnClickListener {
            // Dismiss the dialog when the close button is clicked
            dialog.dismiss()
        }

        // Show the dialog
        dialog.show()
    }

    override fun onRestart() {
        super.onRestart()
        tv?.text = "Counter: $cnt"
    }
}