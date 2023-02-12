package com.example.myapplication.presentation.popular_movies.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.models.Movies
import com.example.myapplication.repository.MoviesRepository
import com.example.myapplication.repository.MoviesRepositoryImpl
import com.example.myapplication.util.ResponseHandler
import kotlinx.coroutines.launch

class PopularMoviesViewModel: ViewModel() {


    private var repository : MoviesRepository = MoviesRepositoryImpl()
    private val moviesMutableLiveData = MutableLiveData<Movies>()
    val moviesLiveData : LiveData<Movies> = moviesMutableLiveData

    private val errorMutableLiveData = MutableLiveData<String>()
    val  errorLivedata : LiveData<String> = errorMutableLiveData


    fun getPopularMovies(){
        viewModelScope.launch {
            when(val response = repository.getPopularMovies()){
                is ResponseHandler.Success -> moviesMutableLiveData.postValue(response.success)
                is ResponseHandler.Error -> errorMutableLiveData.postValue(response.message)
            }

        }
    }
}





































