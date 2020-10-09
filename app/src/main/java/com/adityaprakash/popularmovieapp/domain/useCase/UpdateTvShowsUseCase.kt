package com.adityaprakash.popularmovieapp.domain.useCase

import com.adityaprakash.popularmovieapp.data.model.tvShow.TvShow
import com.adityaprakash.popularmovieapp.domain.repository.TvShowRepository

class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.updateTvShows()
}