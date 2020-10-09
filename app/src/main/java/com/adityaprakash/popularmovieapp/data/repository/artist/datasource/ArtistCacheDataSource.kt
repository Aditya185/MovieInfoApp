package com.adityaprakash.popularmovieapp.data.repository.artist.datasource

import com.adityaprakash.popularmovieapp.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache():List<Artist>
    suspend fun saveArtistsToCache(artists:List<Artist>)

}