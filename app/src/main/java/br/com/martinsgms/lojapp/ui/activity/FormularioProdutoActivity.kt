package br.com.martinsgms.lojapp.ui.activity

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.com.martinsgms.lojapp.R
import br.com.martinsgms.lojapp.databinding.ActivityFormularioProdutoBinding
import br.com.martinsgms.lojapp.model.Produto
import br.com.martinsgms.lojapp.ui.dao.ProdutoDAO
import java.math.BigDecimal

class FormularioProdutoActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityFormularioProdutoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        configuraBotaoSalvar()

        setContentView(binding.root)
    }

    private fun configuraBotaoSalvar() {
        val btnSalvar = binding.activityFormularioProdutoSalvar
        val dao = ProdutoDAO()

        btnSalvar.setOnClickListener {
            dao.save(criaProduto())
            finish()
        }
    }

    private fun criaProduto() : Produto {
        val nomeEditText = binding.activityFormularioProdutoNome
        val nome = nomeEditText.text.toString()

        val descricaoEditText = binding.activityFormularioProdutoDescricao
        val descricao = descricaoEditText.text.toString()

        val valorEditText = binding.activityFormularioProdutoValor
        val valorComoTexto = valorEditText.text.toString()
        val valor = if (valorComoTexto.isBlank()) BigDecimal.ZERO else BigDecimal(valorComoTexto)

        return Produto(nome, descricao, valor)
    }

}