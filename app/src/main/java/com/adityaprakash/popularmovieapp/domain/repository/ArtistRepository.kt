package com.adityaprakash.popularmovieapp.domain.repository

import com.adityaprakash.popularmovieapp.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}