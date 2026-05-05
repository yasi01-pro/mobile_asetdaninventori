package com.example.asetdaninventarisdesa

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourth)

        val btnBack = findViewById<ImageView>(R.id.btn_back)
        val btnAlertDialog = findViewById<Button>(R.id.btn_alert_dialog)
        val btnTombol1 = findViewById<Button>(R.id.btn_tombol1)
        val btnSnackbar = findViewById<Button>(R.id.btn_snackbar)
        val btnKembali = findViewById<Button>(R.id.btn_kembali)

        btnBack.setOnClickListener { finish() }
        btnKembali.setOnClickListener { finish() }

        btnAlertDialog.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alert Dialog")
                .setMessage("Ini adalah contoh Alert Dialog")
                .setPositiveButton("OK") { dialog, _ -> dialog.dismiss() }
                .show()
        }

        btnTombol1.setOnClickListener {
            Toast.makeText(this, "Tombol 1 diklik", Toast.LENGTH_SHORT).show()
        }

        btnSnackbar.setOnClickListener { view ->
            Snackbar.make(view, "Ini adalah Snackbar", Snackbar.LENGTH_LONG).show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.toolbar)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(0, systemBars.top, 0, 0)
            insets
        }
    }
}
