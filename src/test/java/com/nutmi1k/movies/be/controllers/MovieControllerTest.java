package com.nutmi1k.movies.be.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieControllerTest {

    MovieController target = new MovieController();

    @Test
    void testGetMovies() {
        assertEquals("movies",target.getMovies());
    }
}