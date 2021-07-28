package br.com.martinsgms.lojapp.ui.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.martinsgms.lojapp.R
import br.com.martinsgms.lojapp.model.Produto

class ListaProdutosAdapter(

    val context: Context,
    private val produtos: List<Produto>

) : RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>() {

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        fun bind(produto: Produto) {
            val titulo = itemView.findViewById<TextView>(R.id.titulo)
            titulo.text = produto.titulo

            val descricao = itemView.findViewById<TextView>(R.id.descricao)
            descricao.text = produto.descricao

            val valor = itemView.findViewById<TextView>(R.id.valor)
            valor.text = produto.valor.toPlainString()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = produtos[position]
        holder.bind(produto)
    }

    override fun getItemCount(): Int = produtos.size

}
