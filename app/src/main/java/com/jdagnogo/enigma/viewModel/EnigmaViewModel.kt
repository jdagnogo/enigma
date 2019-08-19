package com.jdagnogo.enigma.viewModel

import androidx.lifecycle.ViewModel
import com.jdagnogo.enigma.db.dao.EnigmaDao
import javax.inject.Inject

class EnigmaViewModel @Inject constructor(
    val enigmaDao: EnigmaDao) : ViewModel() {
}