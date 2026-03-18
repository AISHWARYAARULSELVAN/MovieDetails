package com.example.moviedetails

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.moviedetails.R

class MainActivity : AppCompatActivity() {

    private lateinit var btnBasic: Button
    private lateinit var btnAdditional: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBasic = findViewById(R.id.btnBasic)
        btnAdditional = findViewById(R.id.btnAdditional)

        // Load default fragment
        loadFragment(MovieBasicFragment())

        btnBasic.setOnClickListener {
            loadFragment(MovieBasicFragment())
        }

        btnAdditional.setOnClickListener {
            loadFragment(MovieAdditionalFragment())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}
