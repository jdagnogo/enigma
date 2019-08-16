package com.jdagnogo.enigma.di.module

import android.app.Application
import androidx.room.Room

import com.jdagnogo.enigma.db.AppDatabase
import com.jdagnogo.enigma.db.dao.EnigmaDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
@Module
class DbModule{

    /*
     * The method returns the Database object
     * */
    @Provides
    @Singleton
    internal fun provideDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(
            application, AppDatabase::class.java, "Enigma.db").build()
    }


    /**
     * Create to inject enigma dao
     *
     * @param appDatabase
     * @return enigma dao
     */
    @Provides
    @Singleton
    internal fun provideEnigmaDao(appDatabase: AppDatabase): EnigmaDao {
        return appDatabase.enigmaDao()
    }
}