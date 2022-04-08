package com.example.homework15

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework15.presentation.FirstFragment
import com.example.homework15.utils.extensions.navigateToFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.navigateToFragment(fragment = FirstFragment())
    }
}