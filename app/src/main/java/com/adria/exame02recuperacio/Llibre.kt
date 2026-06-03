package com.adria.exame02recuperacio

data class Llibre(
    val id: Int,
    val titol: String,
    val autor: String,
    val genere: Genere,
    val any: Int,
    val estat: Estat
)
