package com.adityaprakash.popularmovieapp.data.repository.tvshow.datasourceImpl


import com.adityaprakash.popularmovieapp.data.api.TMDBService
import com.adityaprakash.popularmovieapp.data.model.tvShow.TvShowList
import com.adityaprakash.popularmovieapp.data.repository.tvshow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): TvShowRemoteDatasource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}

