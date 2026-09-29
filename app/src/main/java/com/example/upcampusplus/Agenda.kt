package com.example.upcampusplus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Agenda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)

        val btnVoltar = findViewById<Button>(R.id.btnVoltar)
        btnVoltar.setOnClickListener {
            finish()
        }

        val btnNovoEvento = findViewById<Button>(R.id.btnNovoEvento)
        btnNovoEvento.setOnClickListener {
            startActivity(Intent(this, CadastroEvento::class.java))
        }

        rvEventos = findViewById(R.id.rvEventos)
    }

    private lateinit var rvEventos: RecyclerView

    override fun onResume() {
        super.onResume()
        val banco = BancoHelper(this)
        val eventos = banco.listar()
        rvEventos.layoutManager = LinearLayoutManager(this)
        rvEventos.adapter = EventoAdapter(eventos) { evento ->
            val intent = Intent(this, DetalheEvento::class.java)
            intent.putExtra("evento_id", evento.id)
            startActivity(intent)
        }
    }
}