package com.example.secondhomework.bonch.dev.school.third_task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.secondhomework.R
import com.example.secondhomework.bonch.dev.school.FirstFragment
import com.example.secondhomework.bonch.dev.school.Models.Counter
import com.example.secondhomework.bonch.dev.school.SecondActivity
import com.example.secondhomework.bonch.dev.school.third_task.MyFragment.Companion.newInstance

class FragmentActivity : AppCompatActivity() {

    private lateinit var attachFragmentButton: Button
    private lateinit var indicatorButton: Button
    private lateinit var counterButton: Button
    private lateinit var textField: TextView
    private lateinit var counter: Counter

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
    }

    private fun initializeViews() {
        attachFragmentButton = findViewById(R.id.attach_fragment_button)
        indicatorButton = findViewById(R.id.indicator_button)
        textField = findViewById(R.id.text_field)
        counterButton = findViewById(R.id.counter_button)
    }

    private fun setListeners() {
        attachFragmentButton.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, newInstance(counter.currentCount, textField.text.toString(), !indicatorButton.isEnabled))
                .commit()

        }
        counterButton.setOnClickListener {
            counter.increment()
            counterButton.text = "Button was tapped ${counter.currentCount} times"
        }
        indicatorButton.setOnClickListener {
            indicatorButton.isEnabled = false
        }
    }

}