package com.mepark.easycook.ui.common

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class CommonActivity<D: ViewDataBinding>(@LayoutRes private val layoutResId: Int) :
    AppCompatActivity() {
    protected lateinit var binding: D

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutResId)
        binding.lifecycleOwner = this@CommonActivity

        //상단 바 없애기
        supportActionBar?.hide()
        //세로고정
        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT


    }
}