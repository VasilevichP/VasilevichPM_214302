package com.example.Cinesoft.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

import java.io.Serializable;

@Entity
@IdClass(GenId.class)
public class Genres {
    @Id
    private long movie;
    @Id
    private String genre;

    public Genres() {
    }

    public long getMovie() {
        return movie;
    }

    public void setMovie(long movie) {
        this.movie = movie;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Genres(long movie, String genre) {
        this.movie = movie;
        this.genre = genre;
    }
}
