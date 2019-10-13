package com.example.secondhomework.bonch.dev.school

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.secondhomework.R
import kotlinx.android.synthetic.main.activity_first_fragment.*
import kotlinx.android.synthetic.main.activity_first_fragment.view.*

class FirstFragment: Fragment() {
    lateinit var nextActivityButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {


        val view = inflater.inflate(R.layout.activity_first_fragment, container, false)

        nextActivityButton = view!!.findViewById(R.id.next_activity_button)

        nextActivityButton.setOnClickListener {
            (context as FragmentActivity).replaceFragment() }

        return view
    }

}
