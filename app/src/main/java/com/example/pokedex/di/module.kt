package com.example.pokedex.di

import com.example.pokedex.data.remote.pokeapi
import com.example.pokedex.repository.PokemonRepository
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object module {

    fun providePokemonRepository(api: pokeapi)= PokemonRepository{}
}