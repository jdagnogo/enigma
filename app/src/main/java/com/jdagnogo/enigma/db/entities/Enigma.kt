package com.jdagnogo.enigma.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "enigma")
data class Enigma(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "title") val title: String = "",
    @ColumnInfo(name = "teaser") val teaser: String = "",
    @ColumnInfo(name = "image") val image: String = "",
    @ColumnInfo(name = "solution") val solution: String = ""
)