package br.com.martinsgms.lojapp.ui.activity

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.com.martinsgms.lojapp.R
import br.com.martinsgms.lojapp.model.Produto
import br.com.martinsgms.lojapp.ui.dao.ProdutoDAO
import java.math.BigDecimal

class FormularioProdutoActivity : AppCompatActivity(R.layout.activity_formulario_produto) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        configuraBotaoSalvar()
    }

    private fun configuraBotaoSalvar() {
        val btnSalvar = findViewById<Button>(R.id.activity_formulario_produto_salvar)
        val dao = ProdutoDAO()

        btnSalvar.setOnClickListener {
            dao.save(criaProduto())
            finish()
        }
    }

    private fun criaProduto() : Produto {
        val nomeEditText = findViewById<EditText>(R.id.activity_formulario_produto_nome)
        val nome = nomeEditText.text.toString()

        val descricaoEditText = findViewById<EditText>(R.id.activity_formulario_produto_descricao)
        val descricao = descricaoEditText.text.toString()

        val valorEditText = findViewById<EditText>(R.id.activity_formulario_produto_valor)
        val valorComoTexto = valorEditText.text.toString()
        val valor = if (valorComoTexto.isBlank()) BigDecimal.ZERO else BigDecimal(valorComoTexto)

        return Produto(nome, descricao, valor)
    }

}