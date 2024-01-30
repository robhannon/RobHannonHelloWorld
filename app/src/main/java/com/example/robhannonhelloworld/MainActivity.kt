package com.example.robhannonhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var HelloButton: Button
    private lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        HelloButton = findViewById(R.id.Hello_Button)
        text = findViewById(R.id.no_text)

        HelloButton.setOnClickListener {
            text.setText(R.string.hello)
        }
    }
}