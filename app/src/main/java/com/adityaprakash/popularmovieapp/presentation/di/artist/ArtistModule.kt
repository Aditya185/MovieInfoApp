package com.adityaprakash.popularmovieapp.presentation.di.artist


import com.adityaprakash.popularmovieapp.domain.useCase.GetArtistsUseCase
import com.adityaprakash.popularmovieapp.domain.useCase.UpdateArtistsUseCase
import com.adityaprakash.popularmovieapp.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }

}