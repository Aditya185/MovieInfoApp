package com.adityaprakash.popularmovieapp.domain.useCase

import com.adityaprakash.popularmovieapp.data.model.artist.Artist
import com.adityaprakash.popularmovieapp.domain.repository.ArtistRepository


class GetArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.getArtists()

}