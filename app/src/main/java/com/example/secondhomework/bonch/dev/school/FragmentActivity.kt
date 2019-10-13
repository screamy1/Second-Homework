package com.example.secondhomework.bonch.dev.school

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.secondhomework.R

class FragmentActivity : AppCompatActivity() {

    val fm = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        //attachFragment()
        val firstFragment = FirstFragment()
        fm.beginTransaction()
            .add(R.id.fragment, firstFragment)
            .commit()

    }

    /*fun attachFragment() {
        val firstFragment = FirstFragment()
        fm.beginTransaction()
            .add(R.id.fragment, firstFragment)
            .commit()
    }*/

    fun replaceFragment() {
        val fragment = SecondFragment()
        fm.beginTransaction()
            .replace(R.id.fragment, fragment)
            .commit()
    }
}


