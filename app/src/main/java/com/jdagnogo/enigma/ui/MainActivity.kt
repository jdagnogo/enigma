package com.jdagnogo.enigma.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.jdagnogo.enigma.R
import com.jdagnogo.enigma.viewModel.EnigmaViewModel
import dagger.android.AndroidInjection
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    internal lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var enigmaViewModel: EnigmaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enigmaViewModel = ViewModelProviders.of(this, viewModelFactory).get(EnigmaViewModel::class.java)
    }
}
