package com.example.secondhomework.bonch.dev.school

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.secondhomework.R

class SecondActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textView = findViewById(R.id.text_view)

        val counterValue = intent.getIntExtra("TAP_AMOUNTS", 0)
        val indicatorValue = intent.getBooleanExtra("INDICATOR", true)
        val textValue = intent.getStringExtra("INPUT_TEXT")

        textView.setText(
                "Is Indicator button pressed? ${!indicatorValue}\n" +
                "Button tapped ${counterValue} times\n" +
                "Input text is ${textValue}")
    }
}
