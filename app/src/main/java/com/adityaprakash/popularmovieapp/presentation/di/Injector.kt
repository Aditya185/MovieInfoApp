package com.adityaprakash.popularmovieapp.presentation.di

import com.adityaprakash.popularmovieapp.presentation.di.artist.ArtistSubComponent
import com.adityaprakash.popularmovieapp.presentation.di.movie.MovieSubComponent
import com.adityaprakash.popularmovieapp.presentation.di.tvshow.TvShowSubComponent


interface Injector {
   fun createMovieSubComponent(): MovieSubComponent
   fun createTvShowSubComponent(): TvShowSubComponent
   fun createArtistSubComponent(): ArtistSubComponent
}