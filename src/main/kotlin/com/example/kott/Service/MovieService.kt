package com.example.kott.Service

import com.example.kott.Model.Movie

interface MovieService {
    fun create(movie: Movie): Movie

    fun getAll(): List<Movie>

    fun removeAll()
}