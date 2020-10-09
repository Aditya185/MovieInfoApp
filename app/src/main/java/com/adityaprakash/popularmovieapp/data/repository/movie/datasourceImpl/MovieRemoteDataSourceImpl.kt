package com.adityaprakash.popularmovieapp.data.repository.movie.datasourceImpl


import com.adityaprakash.popularmovieapp.data.api.TMDBService
import com.adityaprakash.popularmovieapp.data.model.movie.MovieList
import com.adityaprakash.popularmovieapp.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}

