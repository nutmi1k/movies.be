package com.nutmi1k.movies.be.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    @GetMapping("/movies")
    public String getMovies() {
        return "movies";
    }

}
