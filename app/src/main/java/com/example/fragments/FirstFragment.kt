package com.example.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class FirstFragment: Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nextButton = view.findViewById<Button>(R.id.next_fragment)
        nextButton.setOnClickListener { changeFragment() }
    }

    private fun changeFragment() {

        val userInput = view?.findViewById<EditText>(R.id.editText_first_fragment)?.text.toString()

        val fragment = SecondFragment()
        val bundle = Bundle().apply { putString("data", userInput) }
        fragment.arguments = bundle

        parentFragmentManager.beginTransaction()
            .add(R.id.fragment_container_view, fragment)
            .addToBackStack(null)
            .commit()

    }
}