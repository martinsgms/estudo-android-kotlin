package br.com.martinsgms.lojapp

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val titulo = findViewById<TextView>(R.id.titulo)
        titulo.text = "Celular"

        val descricao = findViewById<TextView>(R.id.descricao)
        descricao.text = "Bom celular, tela OLED"

        val valor = findViewById<TextView>(R.id.valor)
        valor.text = "R$ 1.299,00"

    }
}