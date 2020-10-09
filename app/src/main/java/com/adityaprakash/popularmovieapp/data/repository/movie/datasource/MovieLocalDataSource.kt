package com.adityaprakash.popularmovieapp.data.repository.movie.datasource

import com.adityaprakash.popularmovieapp.data.model.movie.Movie


interface MovieLocalDataSource {
  suspend fun getMoviesFromDB():List<Movie>
  suspend fun saveMoviesToDB(movies:List<Movie>)
  suspend fun clearAll()
}