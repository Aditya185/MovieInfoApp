package com.adityaprakash.popularmovieapp.data.repository.artist.datasourceImpl


import com.adityaprakash.popularmovieapp.data.api.TMDBService
import com.adityaprakash.popularmovieapp.data.model.artist.ArtistList
import com.adityaprakash.popularmovieapp.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): ArtistRemoteDatasource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}

