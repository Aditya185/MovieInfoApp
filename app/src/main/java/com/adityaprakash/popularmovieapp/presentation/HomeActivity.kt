package com.adityaprakash.popularmovieapp.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.adityaprakash.popularmovieapp.R
import com.adityaprakash.popularmovieapp.databinding.ActivityMainBinding
import com.adityaprakash.popularmovieapp.presentation.artist.ArtistActivity
import com.adityaprakash.popularmovieapp.presentation.movie.MovieActivity
import com.adityaprakash.popularmovieapp.presentation.tvShow.TvShowActivity


class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.movieButton.setOnClickListener {
            val intent = Intent(this, MovieActivity::class.java)
            startActivity(intent)
        }

        binding.tvButton.setOnClickListener {
            val intent = Intent(this, TvShowActivity::class.java)
            startActivity(intent)
        }

        binding.artistsButton.setOnClickListener {
            val intent = Intent(this, ArtistActivity::class.java)
            startActivity(intent)
        }
    }
}