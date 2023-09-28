package com.example.realestate

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var cnt = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv = findViewById<TextView>(R.id.textView)
        val showDialogButton = findViewById<Button>(R.id.dialogButton)
        val closeAppButton = findViewById<Button>(R.id.closeAppButton)

        showDialogButton.setOnClickListener {
            showCustomDialog()
        }

        var b1 = findViewById<Button>(R.id.plus5)
        b1.setOnClickListener{
            cnt += 5
            tv.setText("Counter: $cnt")
            val intent = Intent(this, Plus5Activity::class.java)
            startActivity(intent)
        }

        var b2 = findViewById<Button>(R.id.plus10)
        b2.setOnClickListener{
            cnt += 10
            tv.setText("Counter: $cnt")
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
}