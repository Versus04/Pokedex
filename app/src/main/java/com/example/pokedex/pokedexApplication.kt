package com.example.pokedex

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp      //tells Hilt to generate a base class gives context to the application
class pokedexApplication: Application() {
        override fun onCreate() {
            super.onCreate()
            Timber.plant(Timber.DebugTree())
        }
}