package com.example.myapplication.api

import com.example.myapplication.models.Movies
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesApi {
    @GET("/3/movie/popular")
    suspend fun getPopularMovies(@Query("api_key")apikey:String = "956b4bd6a9f961e0d1a837c9de42714b"):Response<Movies>
}