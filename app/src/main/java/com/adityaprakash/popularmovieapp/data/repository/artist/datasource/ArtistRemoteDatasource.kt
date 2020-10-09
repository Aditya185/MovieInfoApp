package com.adityaprakash.popularmovieapp.data.repository.artist.datasource

import com.adityaprakash.popularmovieapp.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDatasource {
   suspend fun getArtists(): Response<ArtistList>
}