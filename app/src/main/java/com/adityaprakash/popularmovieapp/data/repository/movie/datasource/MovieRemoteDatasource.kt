package com.adityaprakash.popularmovieapp.data.repository.movie.datasource

import com.adityaprakash.popularmovieapp.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
   suspend fun getMovies(): Response<MovieList>
}