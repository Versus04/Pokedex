package com.example.pokedex.data.remote.responses

data class pokemonlist(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)