package com.adityaprakash.popularmovieapp.domain.useCase

import com.adityaprakash.popularmovieapp.data.model.artist.Artist
import com.adityaprakash.popularmovieapp.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.updateArtists()
}