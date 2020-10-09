package com.adityaprakash.popularmovieapp.data.repository.tvshow.datasourceImpl

import com.adityaprakash.popularmovieapp.data.model.tvShow.TvShow
import com.adityaprakash.popularmovieapp.data.repository.tvshow.datasource.TvShowCacheDataSource

class TvShowCacheDataSourceImpl :
    TvShowCacheDataSource {
    private var tvShowList = ArrayList<TvShow>()

    override suspend fun getTvShowsFromCache(): List<TvShow> {
        return tvShowList
    }

    override suspend fun saveTvShowsToCache(tvShows: List<TvShow>) {
       tvShowList.clear()
       tvShowList = ArrayList(tvShows)
    }
}