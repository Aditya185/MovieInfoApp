package com.adityaprakash.popularmovieapp.domain.repository

import com.adityaprakash.popularmovieapp.data.model.movie.Movie


interface MovieRepository {

    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?

}