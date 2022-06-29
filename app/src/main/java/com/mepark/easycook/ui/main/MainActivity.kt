package com.mepark.easycook.ui.main

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.mepark.easycook.R
import com.mepark.easycook.databinding.ActivityMainBinding
import com.mepark.easycook.ui.common.CommonActivity
import dagger.hilt.android.AndroidEntryPoint

class MainActivity : CommonActivity<ActivityMainBinding>(R.layout.activity_main) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.tvMain.setOnClickListener {
            Navigation.createNavigateOnClickListener(R.id.mainFragment, null)
        }
        binding.tvRecipe.setOnClickListener {
            Navigation.createNavigateOnClickListener(R.id.recipeFragment, null)
        }
        binding.tvRefrigerator.setOnClickListener {
            Navigation.createNavigateOnClickListener(R.id.refrigeratorFragment, null)
        }


    }
}