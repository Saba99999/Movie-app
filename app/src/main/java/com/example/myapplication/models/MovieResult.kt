package com.example.myapplication.models

import com.google.gson.annotations.SerializedName

data class MovieResult (
    @SerializedName("poster_path")
    val posterPath: String? = null,
    val overview:String,
    val release_data: String,
    val title: String,
    val popularity:Int
)