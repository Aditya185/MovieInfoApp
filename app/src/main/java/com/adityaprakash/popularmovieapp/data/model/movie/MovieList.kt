package com.adityaprakash.popularmovieapp.data.model.movie


import com.adityaprakash.popularmovieapp.data.model.movie.Movie
import com.google.gson.annotations.SerializedName

data class MovieList(

    @SerializedName("results")
    val movies: List<Movie>

)