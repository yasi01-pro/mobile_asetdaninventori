package com.example.asetdaninventarisdesa

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val btnLogout = view.findViewById<Button>(R.id.btn_logout_home)
        btnLogout.setOnClickListener {
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }

        // Setup Pertemuan Buttons
        val btnPertemuan2 = view.findViewById<Button>(R.id.btn_pertemuan2)
        val btnPertemuan3 = view.findViewById<Button>(R.id.btn_pertemuan3)
        val btnPertemuan4 = view.findViewById<Button>(R.id.btn_pertemuan4)
        val btnPertemuan5 = view.findViewById<Button>(R.id.btn_pertemuan5)
        val btnPertemuan7 = view.findViewById<Button>(R.id.btn_pertemuan7)

        btnPertemuan2.setOnClickListener {
            val intent = Intent(activity, SecondActivity::class.java)
            startActivity(intent)
        }

        btnPertemuan3.setOnClickListener {
            val intent = Intent(activity, ThirdActivity::class.java)
            startActivity(intent)
        }

        btnPertemuan4.setOnClickListener {
            val intent = Intent(activity, FourthActivity::class.java)
            startActivity(intent)
        }

        btnPertemuan5.setOnClickListener {
            val intent = Intent(activity, FifthActivity::class.java)
            startActivity(intent)
        }

        btnPertemuan7.setOnClickListener {
            val intent = Intent(activity, SeventhActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}
