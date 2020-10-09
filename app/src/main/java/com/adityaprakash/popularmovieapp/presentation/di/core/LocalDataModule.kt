package com.adityaprakash.popularmovieapp.presentation.di.core

import com.adityaprakash.popularmovieapp.data.db.ArtistDao
import com.adityaprakash.popularmovieapp.data.db.MovieDao
import com.adityaprakash.popularmovieapp.data.db.TvShowDao
import com.adityaprakash.popularmovieapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.adityaprakash.popularmovieapp.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.adityaprakash.popularmovieapp.data.repository.movie.datasource.MovieLocalDataSource
import com.adityaprakash.popularmovieapp.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.adityaprakash.popularmovieapp.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.adityaprakash.popularmovieapp.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao : ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }


}