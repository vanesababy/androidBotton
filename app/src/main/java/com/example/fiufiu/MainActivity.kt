package com.example.fiufiu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.button.MaterialButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGoToButtons = findViewById<Button>(R.id.btnGoToButtons)

        // Configura un click listener para el botón
        btnGoToButtons.setOnClickListener {
            // Crea un Intent para ir a la actividad ButtonActivity
            val intent = Intent(this, ButtonActivity::class.java)
            startActivity(intent)
        }
    }
}