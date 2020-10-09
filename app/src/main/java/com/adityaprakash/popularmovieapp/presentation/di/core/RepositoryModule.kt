package com.adityaprakash.popularmovieapp.presentation.di.core

import com.adityaprakash.popularmovieapp.data.repository.artist.ArtistRepositoryImpl
import com.adityaprakash.popularmovieapp.data.repository.artist.datasource.ArtistCacheDataSource
import com.adityaprakash.popularmovieapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.adityaprakash.popularmovieapp.data.repository.artist.datasource.ArtistRemoteDatasource
import com.adityaprakash.popularmovieapp.data.repository.movie.MovieRepositoryImpl
import com.adityaprakash.popularmovieapp.data.repository.movie.datasource.MovieCacheDataSource
import com.adityaprakash.popularmovieapp.data.repository.movie.datasource.MovieLocalDataSource
import com.adityaprakash.popularmovieapp.data.repository.movie.datasource.MovieRemoteDatasource
import com.adityaprakash.popularmovieapp.data.repository.tvshow.TvShowRepositoryImpl
import com.adityaprakash.popularmovieapp.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.adityaprakash.popularmovieapp.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.adityaprakash.popularmovieapp.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.adityaprakash.popularmovieapp.domain.repository.ArtistRepository
import com.adityaprakash.popularmovieapp.domain.repository.MovieRepository
import com.adityaprakash.popularmovieapp.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )


    }

}