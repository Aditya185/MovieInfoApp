package com.adityaprakash.popularmovieapp.presentation.di.movie

import com.adityaprakash.popularmovieapp.domain.useCase.GetMoviesUseCase
import com.adityaprakash.popularmovieapp.domain.useCase.UpdateMoviesUsecase
import com.adityaprakash.popularmovieapp.presentation.di.movie.MovieScope

import com.adityaprakash.popularmovieapp.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUsecase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}