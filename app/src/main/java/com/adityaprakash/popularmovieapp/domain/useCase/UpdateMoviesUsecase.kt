package com.adityaprakash.popularmovieapp.domain.useCase

import com.adityaprakash.popularmovieapp.data.model.movie.Movie
import com.adityaprakash.popularmovieapp.domain.repository.MovieRepository

class UpdateMoviesUsecase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}