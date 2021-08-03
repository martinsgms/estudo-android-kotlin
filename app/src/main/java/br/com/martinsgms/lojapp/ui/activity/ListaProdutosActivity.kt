package br.com.martinsgms.lojapp.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.martinsgms.lojapp.R
import br.com.martinsgms.lojapp.ui.dao.ProdutoDAO
import br.com.martinsgms.lojapp.ui.recyclerview.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaProdutosActivity : AppCompatActivity(R.layout.activity_lista_produtos) {

    private val dao = ProdutoDAO()
    private val adapter = ListaProdutosAdapter(context = this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        configuraRecyclerView()
        configuraFab()
    }

    override fun onResume() {
        super.onResume()

        adapter.atualiza(dao.findAll())
    }

    private fun configuraFab() {
        val fab = findViewById<FloatingActionButton>(R.id.activity_lista_produtos_fab)

        fab.setOnClickListener {
            val intent = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(intent)
        }
    }

    private fun configuraRecyclerView() {
        val produtosRecyclerView = findViewById<RecyclerView>(R.id.activity_lista_produtos_rv)
        produtosRecyclerView.adapter = adapter
    }
}