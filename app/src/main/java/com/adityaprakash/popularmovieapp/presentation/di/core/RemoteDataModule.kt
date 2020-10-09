package com.adityaprakash.popularmovieapp.presentation.di.core

import com.adityaprakash.popularmovieapp.data.api.TMDBService
import com.adityaprakash.popularmovieapp.data.repository.artist.datasource.ArtistRemoteDatasource
import com.adityaprakash.popularmovieapp.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.adityaprakash.popularmovieapp.data.repository.movie.datasource.MovieRemoteDatasource
import com.adityaprakash.popularmovieapp.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.adityaprakash.popularmovieapp.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.adityaprakash.popularmovieapp.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDatasource {
        return MovieRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideTvRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDatasource {
        return TvShowRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDatasource {
        return ArtistRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }


}