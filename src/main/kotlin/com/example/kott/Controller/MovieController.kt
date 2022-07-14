package com.example.kott.Controller

import com.example.kott.Model.Movie
import com.example.kott.Service.MovieService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/")
class MovieController(private val service: MovieService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody  movie: Movie): Movie = service.create(movie)

    @GetMapping
    fun getAll(): List<Movie> = service.getAll()

    @DeleteMapping
    fun removeAll() = service.removeAll()
}