package com.example.upcampusplus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnComecar = findViewById<Button>(R.id.btnComecar)
        btnComecar.setOnClickListener {
            Toast.makeText(this, "UP Campus+ iniciado!", Toast.LENGTH_SHORT).show()
        }
    }
}