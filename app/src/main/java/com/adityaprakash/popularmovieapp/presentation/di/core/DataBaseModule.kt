package com.adityaprakash.popularmovieapp.presentation.di.core

import android.content.Context
import androidx.room.Room
import com.adityaprakash.popularmovieapp.data.db.ArtistDao
import com.adityaprakash.popularmovieapp.data.db.MovieDao
import com.adityaprakash.popularmovieapp.data.db.TMDBDatabase
import com.adityaprakash.popularmovieapp.data.db.TvShowDao
import dagger.Module

import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule {
    @Singleton
    @Provides
    fun provideMovieDataBase(context: Context): TMDBDatabase {
     return Room.databaseBuilder(context,TMDBDatabase::class.java,"tmdbclient")
         .build()
    }
    @Singleton
    @Provides
    fun provideMovieDao(tmdbDatabase: TMDBDatabase): MovieDao {
        return tmdbDatabase.movieDao()
    }

    @Singleton
    @Provides
    fun provideTvDao(tmdbDatabase: TMDBDatabase): TvShowDao {
        return tmdbDatabase.tvDao()
    }

    @Singleton
    @Provides
    fun provideArtistDao(tmdbDatabase: TMDBDatabase): ArtistDao {
        return tmdbDatabase.artistDao()
    }





}