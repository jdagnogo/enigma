package com.jdagnogo.enigma.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.jdagnogo.enigma.db.dao.EnigmaDao
import com.jdagnogo.enigma.db.entities.EnigmaEntity

@Database(entities = arrayOf(EnigmaEntity::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun enigmaDao(): EnigmaDao
}