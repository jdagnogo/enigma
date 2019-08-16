package com.jdagnogo.enigma.db.dao


import androidx.room.*
import com.jdagnogo.enigma.db.entities.Enigma

@Dao
interface EnigmaDao {
    @Query("SELECT * FROM enigma")
    fun getAll(): List<Enigma>


    @Delete
    fun delete(enigma: Enigma)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg enigma: Enigma)
}