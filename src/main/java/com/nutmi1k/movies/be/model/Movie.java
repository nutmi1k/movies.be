package com.nutmi1k.movies.be.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String director;
    private Integer year;
    private Integer rating;
    private Boolean dvd;
    @Column(name="blue_ray")
    private Boolean blueRay;
}
