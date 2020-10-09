package com.adityaprakash.popularmovieapp.data.repository.tvshow.datasource

import com.adityaprakash.popularmovieapp.data.model.tvShow.TvShow


interface TvShowLocalDataSource {
  suspend fun getTvShowsFromDB():List<TvShow>
  suspend fun saveTvShowsToDB(tvShows:List<TvShow>)
  suspend fun clearAll()
}