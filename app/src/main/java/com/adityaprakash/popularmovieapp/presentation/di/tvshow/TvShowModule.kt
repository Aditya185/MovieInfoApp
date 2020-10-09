package com.adityaprakash.popularmovieapp.presentation.di.tvshow

import com.adityaprakash.popularmovieapp.domain.useCase.GetTvShowsUseCase
import com.adityaprakash.popularmovieapp.domain.useCase.UpdateTvShowsUseCase
import com.adityaprakash.popularmovieapp.presentation.tvShow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}