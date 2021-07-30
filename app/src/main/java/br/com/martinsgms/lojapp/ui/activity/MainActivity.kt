package br.com.martinsgms.lojapp.ui.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.martinsgms.lojapp.R
import br.com.martinsgms.lojapp.model.Produto
import br.com.martinsgms.lojapp.ui.recyclerview.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity(
    R.layout.activity_main
) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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

        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton3)
        fab.setOnClickListener{
            val intent = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(intent)
        }
    }
}