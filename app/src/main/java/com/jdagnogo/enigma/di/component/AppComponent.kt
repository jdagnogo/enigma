package com.jdagnogo.enigma.di.component

import android.app.Application
import com.jdagnogo.enigma.EnigmaApplication
import com.jdagnogo.enigma.di.module.ActivityModule
import com.jdagnogo.enigma.di.module.ApiModule
import com.jdagnogo.enigma.di.module.DbModule
import com.jdagnogo.enigma.di.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Component(
    modules = [
        ApiModule::class,
        DbModule::class,
        ViewModelModule::class,
        ActivityModule::class,
        AndroidSupportInjectionModule::class]
)
@Singleton
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
    fun inject(application: EnigmaApplication)
}