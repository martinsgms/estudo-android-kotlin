package br.com.martinsgms.lojapp.ui.dao

import br.com.martinsgms.lojapp.model.Produto

class ProdutoDAO {

    fun save(produto : Produto) {
        produtos.add(produto)
    }

    fun findAll() : List<Produto> {
        return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>()
    }

}