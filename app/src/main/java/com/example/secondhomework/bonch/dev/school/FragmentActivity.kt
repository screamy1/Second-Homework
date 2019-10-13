package com.example.secondhomework.bonch.dev.school

import android.app.PendingIntent.getActivity
import android.content.ComponentName
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.secondhomework.R
import kotlinx.android.synthetic.main.activity_first_fragment.*

class FragmentActivity : AppCompatActivity() {

    val fm = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        attachFragment()
    }

    fun attachFragment() {
        fm
            .beginTransaction()
            .add(R.id.fragment, FirstFragment())
            .commit()
    }

    fun replaceFragment() {
        fm
            .beginTransaction()
            .replace(R.id.fragment, SecondFragment())
            .addToBackStack(null)
            .commit()
    }
}


