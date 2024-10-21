package com.example.pokedex.repository

import com.example.pokedex.data.remote.pokeapi
import com.example.pokedex.data.remote.responses.Pokemon
import com.example.pokedex.data.remote.responses.pokemonlist
import com.example.pokedex.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject


@ActivityScoped
class PokemonRepository @Inject constructor( private val api: pokeapi){
    suspend fun getPokemonList(limit: Int , offset: Int): Resource<pokemonlist>
    {
        val response = try{
            api.getPokemonList(limit,offset)
        }
        catch (e: Exception){
            return Resource.Error("Unknown Error Occured.   ")
        }

       return Resource.Sucess(response)
    }

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>
    {
        val response = try{
            api.getpokemondata(pokemonName)
        }
        catch (e: Exception){
            return Resource.Error("Unknown Error Occured.   ")
        }

        return Resource.Sucess(response)
    }
}