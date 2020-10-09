package com.adityaprakash.popularmovieapp.data.repository.tvshow.datasource

import com.adityaprakash.popularmovieapp.data.model.tvShow.TvShow


interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShows:List<TvShow>)

}