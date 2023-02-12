package com.example.myapplication.util

sealed class ResponseHandler<T>{
    data class Success<T>(val success: T): ResponseHandler<T>()
    data class Error<T>(val message: String): ResponseHandler<T>()

}
