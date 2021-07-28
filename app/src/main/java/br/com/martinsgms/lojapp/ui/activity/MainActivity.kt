package br.com.martinsgms.lojapp.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.martinsgms.lojapp.R
import br.com.martinsgms.lojapp.model.Produto
import br.com.martinsgms.lojapp.ui.recyclerview.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val produtosRecyclerView = findViewById<RecyclerView>(R.id.ProdutosRV)
        produtosRecyclerView.adapter = ListaProdutosAdapter(this, listOf(
            Produto(
                "Celular Motorola",
                "Celular em bom estado, tela OLED",
                BigDecimal("1299.99")
            ), Produto(
                "Mochila Nike",
                "Mochila rasgada",
                BigDecimal("10.99")
            ), Produto(
                "Caderno 12 matérias",
                "Nunca usado",
                BigDecimal("13.99")
            )
        ))
    }
}