package com.example.upcampusplus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetalheEvento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_evento)

        val id = intent.getIntExtra("evento_id", -1)
        val evento = BancoHelper(this).buscarPorId(id)
        if (evento != null) {
            findViewById<TextView>(R.id.tvDetalheNome).text = evento.nome
            findViewById<TextView>(R.id.tvDetalheInfo).text = "${evento.data} • ${evento.local}"
            findViewById<TextView>(R.id.tvDetalheDescricao).text = evento.descricao
        }
    }
}