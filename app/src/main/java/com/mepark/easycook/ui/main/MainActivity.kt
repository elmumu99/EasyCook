package com.mepark.easycook.ui.main

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
        //초기화
        supportFragmentManager.beginTransaction().replace(R.id.linearLayout , MainFragment()).commitAllowingStateLoss()

        binding.bottomNavigationView.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.action_recipe ->{
                    supportFragmentManager.beginTransaction().replace(R.id.linearLayout , RecipeFragment()).commitAllowingStateLoss()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_main ->{
                    supportFragmentManager.beginTransaction().replace(R.id.linearLayout , MainFragment()).commitAllowingStateLoss()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_refrigerator ->{
                    supportFragmentManager.beginTransaction().replace(R.id.linearLayout , RefrigeratorFragment()).commitAllowingStateLoss()
                    return@setOnNavigationItemSelectedListener true
                }
                else -> {
                    return@setOnNavigationItemSelectedListener false
                }
            }
        }
    }


}