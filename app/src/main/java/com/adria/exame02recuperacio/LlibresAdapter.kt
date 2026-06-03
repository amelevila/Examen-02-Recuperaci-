package com.adria.exame02recuperacio

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class LlibresAdapter(private val onClickLlibre: (Llibre) -> Unit) : RecyclerView.Adapter<LlibreViewHolder>() {

    private var llibres = listOf<Llibre>()

    override fun getItemCount() = llibres.size

    fun setLlibres(nousLlibres: List<Llibre>) {
        llibres = nousLlibres
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LlibreViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_llibre, parent, false)
        return LlibreViewHolder(view)
    }

    override fun onBindViewHolder(holder: LlibreViewHolder, position: Int) {
        holder.renderitza(llibres[position])
        holder.itemView.setOnClickListener { onClickLlibre(llibres[position]) }
    }

}