package edu.temple.startingservices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextValue: EditText = findViewById(R.id.editTextValue)
        val buttonStart: Button = findViewById(R.id.buttonStart)

        buttonStart.setOnClickListener {
            val value = editTextValue.text.toString().toIntOrNull()
            if (value != null) {
                val intent = Intent(this, CountdownService::class.java)
                intent.putExtra("countdownValue", value)
                startService(intent)
            }
        }
    }
}