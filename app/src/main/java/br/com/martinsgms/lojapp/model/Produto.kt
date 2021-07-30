package br.com.martinsgms.lojapp.model

import java.math.BigDecimal

data class Produto(
    val titulo : String,
    val descricao : String,
    val valor: BigDecimal
)
