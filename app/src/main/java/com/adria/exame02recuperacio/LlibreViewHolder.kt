package com.adria.exame02recuperacio

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LlibreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val tvTitol = itemView.findViewById<TextView>(R.id.tvTitol)
    val tvAutor = itemView.findViewById<TextView>(R.id.tvAutor)
    val tvGenere = itemView.findViewById<TextView>(R.id.tvGenere)
    val tvAny = itemView.findViewById<TextView>(R.id.tvAny)
    val tvEstat = itemView.findViewById<TextView>(R.id.tvEstat)

    fun renderitza(llibre: Llibre) {
        tvTitol.text = llibre.titol
        tvAutor.text = llibre.autor
        tvGenere.text = llibre.genere.nom
        tvAny.text = llibre.any.toString()
        tvEstat.text = llibre.estat.nom
    }
}