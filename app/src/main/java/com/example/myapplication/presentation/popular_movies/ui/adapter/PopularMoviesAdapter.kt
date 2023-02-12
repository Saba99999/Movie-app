package com.example.myapplication.presentation.popular_movies.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.PopularMoviesAdapterItemBinding
import com.example.myapplication.models.MovieResult
import com.example.myapplication.models.Movies

class PopularMoviesAdapter : RecyclerView.Adapter<PopularMoviesAdapter.PopularMoviesViewHolder>() {

    private var moviesList = listOf<MovieResult>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularMoviesViewHolder {
        val myViewHolder = PopularMoviesViewHolder(PopularMoviesAdapterItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
        return myViewHolder
    }

    override fun onBindViewHolder(holder: PopularMoviesViewHolder, position: Int) {
        holder.onBind(moviesList.get(position))
    }

    override fun getItemCount(): Int {
        return moviesList.size
    }

    fun setMoviesList(newMoviesList: List<MovieResult>){
        moviesList = newMoviesList
        notifyDataSetChanged()
    }

    class PopularMoviesViewHolder(val binding: PopularMoviesAdapterItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun onBind(movies: MovieResult){
            binding.ratingTextView.text = movies.popularity.toString()
            binding.releaseDateTextView.text = movies.release_data
        }
    }

}