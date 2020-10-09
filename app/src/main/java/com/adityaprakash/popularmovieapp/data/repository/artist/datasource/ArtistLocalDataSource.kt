package com.adityaprakash.popularmovieapp.data.repository.artist.datasource

import com.adityaprakash.popularmovieapp.data.model.artist.Artist


interface ArtistLocalDataSource {
  suspend fun getArtistsFromDB():List<Artist>
  suspend fun saveArtistsToDB(artists:List<Artist>)
  suspend fun clearAll()
}