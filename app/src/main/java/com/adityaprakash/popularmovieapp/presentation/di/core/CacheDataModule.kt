package com.adityaprakash.popularmovieapp.presentation.di.core

import com.adityaprakash.popularmovieapp.data.repository.artist.datasource.ArtistCacheDataSource
import com.adityaprakash.popularmovieapp.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.adityaprakash.popularmovieapp.data.repository.movie.datasource.MovieCacheDataSource
import com.adityaprakash.popularmovieapp.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.adityaprakash.popularmovieapp.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.adityaprakash.popularmovieapp.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }


}