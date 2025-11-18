package com.nutmi1k.movies.be.controllers;


import com.nutmi1k.movies.be.model.Movie;
import com.nutmi1k.movies.be.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/movies")
    public Iterable<Movie> getMovies() {
        return movieRepository.findAll();
    }

    @PostMapping("/movie")
    public String addMovie(@RequestBody Movie movie) {
        Movie savedMovie = movieRepository.save(movie);
        return savedMovie.getName();
    }

}
