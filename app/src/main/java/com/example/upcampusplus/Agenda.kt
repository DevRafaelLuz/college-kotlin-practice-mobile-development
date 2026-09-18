package com.example.upcampusplus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Agenda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)

        val btnVoltar = findViewById<Button>(R.id.btnVoltar)
        btnVoltar.setOnClickListener {
            finish()
        }
    }
}