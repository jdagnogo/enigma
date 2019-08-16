package com.jdagnogo.enigma.db.repository

import com.jdagnogo.enigma.db.dao.EnigmaDao
import javax.inject.Singleton

@Singleton
class EnigmaRepository private constructor(private val enigmaDao: EnigmaDao) {

}