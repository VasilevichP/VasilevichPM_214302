package com.example.Cinesoft.Services;

import com.example.Cinesoft.Entities.Genres;
import com.example.Cinesoft.Entities.Movie;
import com.example.Cinesoft.Repositories.GenresRepository;
import com.example.Cinesoft.Repositories.HallRepository;
import com.example.Cinesoft.Repositories.MovieRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {
//    MovieService movieService;
//    MovieRepository movieRepository;
//    GenresRepository genresRepository;
//    @Before
//    public void setUp(){
//        movieService = new MovieService(movieRepository,genresRepository);
//    }
//
//    @Test
//    void addMovieToDB() {
//        Movie movie = new Movie();
//        assertEquals(true,movieService.addMovieToDB(movie));
//    }
//    @Test(expected = Exception.class)
//    void addEmptyHallToDB() {
//        Movie movie = null;
//        movieService.addMovieToDB(movie);
//    }
//
//    @Test
//    void getAllMovies() {
//        Movie mov1 = new Movie();movieService.addMovieToDB(mov1);
//        Movie mov2 = new Movie();movieService.addMovieToDB(mov2);
//        ArrayList<Movie> arr1 = new ArrayList<>();
//        arr1.add(mov1);arr1.add(mov2);
//        ArrayList<Movie> arr2 = (ArrayList<Movie>) movieService.getAllMovies();
//        assertEquals(arr1,arr2);
//    }
}