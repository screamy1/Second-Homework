package com.example.secondhomework.bonch.dev.school

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.secondhomework.R
import com.example.secondhomework.bonch.dev.school.Models.Counter

class FirstActivity : AppCompatActivity() {

    private lateinit var indicatorButton: Button
    private lateinit var counterButton: Button
    private lateinit var textField: TextView
    private lateinit var nextActivityButton: Button
    private lateinit var counter: Counter
    private var indic: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        initializeViews()
        setListeners()

        counter = if (savedInstanceState == null) {
            Counter()
        } else {
            Counter(savedInstanceState.getInt("TAP_AMOUNTS"))
        }

        counterButton.text = "Button was tapped ${counter.currentCount} times"

    }

    private fun initializeViews() {
        indicatorButton = findViewById(R.id.indicator_button)
        textField = findViewById(R.id.text_field)
        nextActivityButton = findViewById(R.id.next_activity_button)
        counterButton = findViewById(R.id.counter_button)
    }

    private fun setListeners() {
        counterButton.setOnClickListener {
            counter.increment()
            counterButton.text = "Button was tapped ${counter.currentCount} times"
        }
        nextActivityButton.setOnClickListener {
            val intent = Intent(FirstActivity@this, SecondActivity::class.java)
            intent.putExtra("INDICATOR", indic)
            intent.putExtra("TAP_AMOUNTS", counter.currentCount)
            intent.putExtra("INPUT_TEXT", textField.text.toString())
            startActivity(intent)
        }
        indicatorButton.setOnClickListener {
            indicatorButton.isEnabled = false
            indic = indicatorButton.isEnabled
            indicatorButton.text = "Unable"
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("TAP_AMOUNTS", counter.currentCount)
    }

}
