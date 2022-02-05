package com.example.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment: Fragment(R.layout.fragment_second) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val inputData = arguments?.getString("data")
        val textView = view.findViewById<TextView>(R.id.textView)
        textView.text = inputData.toString()

        val backButton = view.findViewById<Button>(R.id.back_fragment)
        backButton.setOnClickListener { parentFragmentManager.popBackStack() }
    }
}