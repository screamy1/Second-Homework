package com.example.secondhomework.bonch.dev.school

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        counter = if (savedInstanceState == null) {
            Counter()
        } else {
            Counter(savedInstanceState.getInt("TAP_AMOUNTS"))
        }
    }
}
