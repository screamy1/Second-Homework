package com.example.secondhomework.bonch.dev.school

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.secondhomework.R

class FirstFragment: Fragment() {

    private lateinit var nextActivityButton: Button

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
            val view = inflater.inflate(R.layout.activity_fragment, container, false)
            //nextActivityButton = view.findViewById(R.id.next_activity_button)
            return view

        /*nextActivityButton.setOnClickListener( {
            (context as FragmentActivity).replaceFragment()
        })*/
    }

}
