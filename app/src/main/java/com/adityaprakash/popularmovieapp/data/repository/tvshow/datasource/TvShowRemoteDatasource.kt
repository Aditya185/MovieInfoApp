package com.adityaprakash.popularmovieapp.data.repository.tvshow.datasource


import com.adityaprakash.popularmovieapp.data.model.tvShow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
   suspend fun getTvShows(): Response<TvShowList>
}