package com.example.m015_room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Word::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun wordDao(): WordDao
}