package com.mepark.easycook.ui.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mepark.easycook.R
import com.mepark.easycook.ui.main.MainActivity

class Onboarding2Fragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_onboarding2, container, false)

        view.findViewById<View>(R.id.view_start).setOnClickListener {
            startActivity(Intent(activity,MainActivity::class.java))
            activity?.finish()
        }

        return view
    }

}