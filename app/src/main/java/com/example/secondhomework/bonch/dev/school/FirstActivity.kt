package com.example.secondhomework.bonch.dev.school

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.secondhomework.R
import com.example.secondhomework.bonch.dev.school.Models.Counter
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    private lateinit var indicatorButton: Button
    private lateinit var counterButton: Button
    private lateinit var textField: TextView
    private lateinit var nextActivityButton: Button
    private lateinit var counter: Counter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        initializeViews()
        setListener()

        counter = if (savedInstanceState == null) {
            Counter()
        } else {
            Counter(savedInstanceState.getInt("TAP_AMOUNTS"))
        }
    }

    private fun initializeViews() {
        indicatorButton = findViewById(R.id.indicator_button)
        textField = findViewById(R.id.text_field)
        nextActivityButton = findViewById(R.id.next_activity_button)
        counterButton = findViewById(R.id.counter_button)
    }

    private fun setListener() {
        counterButton.setOnClickListener {
            counter.increment()
            counterButton.text = "Button was tapped ${counter.currentCount} times"
        }
    }
}
