package com.example.m015_room

import android.app.Application
import androidx.room.Room

class App : Application() {
    lateinit var db: AppDatabase

    override fun onCreate() {
        super.onCreate()
        db = Room
            .databaseBuilder(
                this,
                AppDatabase::class.java,
                "db"
            ).build()
    }


}