package com.example.secondhomework.bonch.dev.school.third_task

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.secondhomework.R
import kotlinx.android.synthetic.main.activity_fragment.*

class MyFragment: Fragment() {

    private lateinit var textView: TextView

    companion object {
        @JvmStatic
        fun newInstance(counter: Int, textField: String, indicator: Boolean) = MyFragment().apply {
            arguments = Bundle().apply {
                putInt("counter", counter)
                putString("text_field", textField)
                putBoolean("indicator", indicator)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.activity_my_fragment, container, false)

        textView = view!!.findViewById(R.id.text_view)
        textView.text = "Button was tapped ${arguments?.getInt("counter")} times\n " +
                "Input text: ${arguments?.getString("text_field")} \n " +
                "Button is pressed? ${arguments?.getBoolean("indicator")}"
        return view
    }
}
