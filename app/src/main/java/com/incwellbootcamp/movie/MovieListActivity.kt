package com.incwellbootcamp.movie

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MovieListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        var movieListAdapter = MovieListAdapter(this, getMovies())
        var layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_movie.layoutManager = layoutManager
        rv_movie.adapter = movieListAdapter
    }

    fun getMovies(): ArrayList<Movie> {
        var movies = ArrayList<Movie>()
        movies.add(Movie("Avengers End game", "http:imageUrl.com"))
        movies.add(Movie("Fast and Furious", "http:imageUrl.com"))
        movies.add(Movie("Black Panther", "http:imageUrl.com"))
        movies.add(Movie("Captain America", "http:imageUrl.com"))
        movies.add(Movie("Batman", "http:imageUrl.com"))
        movies.add(Movie("Spider-man", "http:imageUrl.com"))
        return movies
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.movie_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.search) {
            Toast.makeText(this, "search clicked", Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
