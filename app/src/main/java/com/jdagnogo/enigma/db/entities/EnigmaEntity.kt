package com.jdagnogo.enigma.db.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "enigma")
data class EnigmaEntity(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "title") val title: String = "",
    @ColumnInfo(name = "teaser") val teaser: String = "",
    @ColumnInfo(name = "image") val image: String = "",
    @ColumnInfo(name = "solution") val solution: String = ""
)