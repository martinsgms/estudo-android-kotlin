package br.com.martinsgms.lojapp.ui.activity

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.com.martinsgms.lojapp.R
import br.com.martinsgms.lojapp.model.Produto
import java.math.BigDecimal

class FormularioProdutoActivity : AppCompatActivity(R.layout.activity_formulario_produto) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val btnSalvar = findViewById<Button>(R.id.btnSalvar)
        Log.i("FProduto", "onCreate")
        btnSalvar.setOnClickListener {
            val nomeEditText = findViewById<EditText>(R.id.nome)
            val nome = nomeEditText.text.toString()

            val descricaoEditText = findViewById<EditText>(R.id.descricao)
            val descricao = descricaoEditText.text.toString()

            val valorEditText = findViewById<EditText>(R.id.valor)
            val valorComoTexto = valorEditText.text.toString()
            val valor = if (valorComoTexto.isBlank()) BigDecimal.ZERO else BigDecimal(valorComoTexto)

            val produto = Produto(nome, descricao, valor)
            Log.i("FormularioProduto", "criado: $produto")

        }
    }

}