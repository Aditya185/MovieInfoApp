package com.adityaprakash.popularmovieapp.domain.repository

import com.adityaprakash.popularmovieapp.data.model.tvShow.TvShow


interface TvShowRepository {
    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}