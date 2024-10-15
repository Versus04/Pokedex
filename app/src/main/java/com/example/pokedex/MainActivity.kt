package com.example.pokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.pokedex.ui.theme.PokedexTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokedexTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {

                    val navController = rememberNavController()
                    NavHost(navController , startDestination = "pokemonlist")
                    {
                        composable("pokemonlist")
                        {

                        }
                    composable("pokemondetails/{dominantcolor}/{pokemon_name}" , arguments = listOf(
                        navArgument("dominantcolor")
                        {
                            type= NavType.IntType
                        },
                        navArgument("pokemon_name")
                        {
                            type= NavType.StringType
                        }

                    ))
                    {

                        val dominantcolor = remember {
                                val color = it.arguments?.getInt("dominantcolor")
                                color?.let { Color(it)?: Color.White }
                        }
                        val pokemon_name= remember {
                            val name = it.arguments?.getString("pokemon_name")
                        }

                    }
                        composable(" ")
                        {

                        }
                    }
                }
            }
        }
    }
}

