package com.incwellbootcamp.movie

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.movie_item_view.view.*

class MovieListAdapter(var context: Context, var movies : ArrayList<Movie>) : RecyclerView.Adapter<MovieListHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.movie_item_view, parent, false)
        return  MovieListHolder(view)
    }

    override fun getItemCount(): Int {
       return movies.size
    }

    override fun onBindViewHolder(holder: MovieListHolder, position: Int) {
        holder.itemView.movie_title.text = movies[position].title
    }

}

class MovieListHolder(itemView: View) : RecyclerView.ViewHolder(itemView)