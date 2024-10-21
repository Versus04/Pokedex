package com.example.pokedex.data.remote



import com.example.pokedex.data.remote.responses.Pokemon
import com.example.pokedex.data.remote.responses.pokemonlist
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
interface pokeapi {

    @GET("pokemon")
    suspend fun getPokemonList(@Query("") limit : Int , @Query("") offset : Int): pokemonlist
    @GET("pokemon/{name}")
    suspend fun  getpokemondata(@Path("name") name : String): Pokemon
}