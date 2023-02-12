package com.example.myapplication.repository

import com.example.myapplication.api.RetrofitInstance
import com.example.myapplication.models.Movies
import com.example.myapplication.util.ResponseHandler

class MoviesRepositoryImpl: MoviesRepository {
    override suspend fun getPopularMovies(): ResponseHandler<Movies> {
      val response =  RetrofitInstance.moviesApi.getPopularMovies()
      if (response.isSuccessful){
          return ResponseHandler.Success(response.body()!!)
      }else{
          return ResponseHandler.Error(response.message())
      }
    }


}