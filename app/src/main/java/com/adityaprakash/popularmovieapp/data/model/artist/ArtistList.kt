package com.adityaprakash.popularmovieapp.data.model.artist



import com.google.gson.annotations.SerializedName

data class ArtistList(

    @SerializedName("results")
    val artists: List<Artist>

)