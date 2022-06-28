package com.mepark.easycook.ui.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mepark.easycook.R
import com.mepark.easycook.databinding.ActivityOnboardingBinding
import com.mepark.easycook.ui.common.CommonActivity

class OnboardingActivity : CommonActivity<ActivityOnboardingBinding>(R.layout.activity_onboarding) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewPager = binding.pager

        viewPager.adapter = OnboardingPagerAdapter(supportFragmentManager, lifecycle)


    }
}