package com.adityaprakash.popularmovieapp.data.repository.movie.datasource

import com.adityaprakash.popularmovieapp.data.model.movie.Movie


interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies:List<Movie>)

}