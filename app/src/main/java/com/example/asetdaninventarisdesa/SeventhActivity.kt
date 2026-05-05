package com.example.asetdaninventarisdesa

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class SeventhActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_seventh)

        val btnBack = findViewById<ImageView>(R.id.btn_back)
        val btnFrag1 = findViewById<Button>(R.id.btn_fragment1)
        val btnFrag2 = findViewById<Button>(R.id.btn_fragment2)
        val btnFrag3 = findViewById<Button>(R.id.btn_fragment3)

        btnBack.setOnClickListener { finish() }

        // Load Fragment 1 by default
        if (savedInstanceState == null) {
            replaceFragment(FragmentOne())
        }

        btnFrag1.setOnClickListener { replaceFragment(FragmentOne()) }
        btnFrag2.setOnClickListener { replaceFragment(FragmentTwo()) }
        btnFrag3.setOnClickListener { replaceFragment(FragmentThree()) }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.toolbar)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(0, systemBars.top, 0, 0)
            insets
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_seven, fragment)
            .commit()
    }
}
