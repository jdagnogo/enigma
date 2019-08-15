package com.jdagnogo.enigma.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.jdagnogo.enigma.db.entities.EnigmaEntity

@Dao
interface EnigmaDao {
    @Query("SELECT * FROM enigma")
    fun getAll(): List<EnigmaEntity>


    @Delete
    fun delete(enigmaEntity: EnigmaEntity)

    @Insert
    fun insertAll(vararg enigmaEntity: EnigmaEntity)
}