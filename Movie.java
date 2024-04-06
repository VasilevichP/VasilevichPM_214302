package com.example.Cinesoft.Entities;


import com.example.Cinesoft.Services.MovieService;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.ArrayList;

@Entity
public class Movie {


    @jakarta.persistence.Id
    @Id
    private Long id;
    private String name;
    private int permission;
    private String poster;
    private String shortDescription;
    private int movieLength;
    private int ageRating;
    private LocalDate date_of_return;

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public LocalDate getDate_of_return() {
        return date_of_return;
    }

    public void setDate_of_return(LocalDate date_of_return) {
        this.date_of_return = date_of_return;
    }

    public Movie(Long id, String name, int movieLength, int ageRating, String shortDescription, String poster) {
        this.name = name;
        this.id = id;
        this.shortDescription = shortDescription;
        this.movieLength = movieLength;
        this.ageRating = ageRating;
//        this.genres = genres;
        this.poster = poster;
    }

    public Movie() {
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public int getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(int movieLength) {
        this.movieLength = movieLength;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
