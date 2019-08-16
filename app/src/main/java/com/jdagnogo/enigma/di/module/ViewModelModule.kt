package com.jdagnogo.enigma.di.module


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jdagnogo.enigma.di.utils.ViewModelFactory
import com.jdagnogo.enigma.di.utils.ViewModelKey
import com.jdagnogo.enigma.viewModel.EnigmaViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(EnigmaViewModel::class)
    protected abstract fun enigmaViewModel(enigmaViewModel: EnigmaViewModel): ViewModel
}

