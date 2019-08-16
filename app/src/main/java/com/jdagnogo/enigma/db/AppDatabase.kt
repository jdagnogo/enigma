package com.jdagnogo.enigma.db


import androidx.room.Database
import androidx.room.RoomDatabase
import com.jdagnogo.enigma.db.dao.EnigmaDao
import com.jdagnogo.enigma.db.entities.Enigma

@Database(entities = arrayOf(Enigma::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun enigmaDao(): EnigmaDao
}