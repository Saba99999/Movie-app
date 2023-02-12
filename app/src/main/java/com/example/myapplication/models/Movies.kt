package com.example.myapplication.models

import android.graphics.pdf.PdfRenderer.Page

data class Movies(
    val page: Int,
    val results: List<MovieResult>
)