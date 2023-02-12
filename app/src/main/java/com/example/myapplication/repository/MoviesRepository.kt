package com.example.myapplication.repository

import com.example.myapplication.models.Movies
import com.example.myapplication.util.ResponseHandler

interface MoviesRepository{
    suspend fun getPopularMovies():ResponseHandler<Movies>
}