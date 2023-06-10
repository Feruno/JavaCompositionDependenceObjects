package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MovieManagerTest {

    MovieList movie1 = new MovieList(1, "боевик", "бладшот", 111);
    MovieList movie2 = new MovieList(2, "мультфильм", "вперед", 222);
    MovieList movie3 = new MovieList(3, "комедия", "отель белгарад", 333);
    MovieList movie4 = new MovieList(4, "боевик", "джентльмены", 444);
    MovieList movie5 = new MovieList(5, "ужасы", "человек невидимка", 555);
    MovieList movie6 = new MovieList(6, "мультфильм", "тролли мировой тур", 666);
    MovieList movie7 = new MovieList(7, "комедия", "номер один", 777);

    @Test
    public void addMovie() {
        MovieManager movie = new MovieManager();
        movie.addMovie(movie1);
        movie.addMovie(movie2);
        movie.addMovie(movie3);
        movie.addMovie(movie4);
        movie.addMovie(movie5);
        movie.addMovie(movie6);
        movie.addMovie(movie7);

        MovieList[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        MovieList[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addOneMovie() {
        MovieManager movie = new MovieManager();
        movie.addMovie(movie1);

        MovieList[] expected = {movie1};
        MovieList[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addEmptyMovie() {
        MovieManager movie = new MovieManager();

        MovieList[] expected = {};
        MovieList[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLast() {
        MovieManager movie = new MovieManager(7);
        movie.addMovie(movie1);
        movie.addMovie(movie2);
        movie.addMovie(movie3);
        movie.addMovie(movie4);
        movie.addMovie(movie5);
        movie.addMovie(movie6);


        MovieList[] actual = movie.findLast();
        MovieList[] expected = {movie6, movie5, movie4, movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);

        System.out.println(Arrays.deepToString(actual));

    }

    @Test
    public void findLastFive() {
        MovieManager movie = new MovieManager();
        movie.addMovie(movie1);
        movie.addMovie(movie2);
        movie.addMovie(movie3);
        movie.addMovie(movie4);
        movie.addMovie(movie5);


        MovieList[] actual = movie.findLast();
        MovieList[] expected = {movie5, movie4, movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);

        System.out.println(Arrays.deepToString(actual));

    }

    @Test
    public void findLastOneMovie() {
        MovieManager movie = new MovieManager();
        movie.addMovie(movie1);

        MovieList[] actual = movie.findLast();
        MovieList[] expected = {movie1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastOneMovieParam() {
        MovieManager movie = new MovieManager(1);
        movie.addMovie(movie1);

        MovieList[] actual = movie.findLast();
        MovieList[] expected = {movie1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastEmpty() {
        MovieManager movie = new MovieManager();

        MovieList[] actual = movie.findLast();
        MovieList[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastEmptyParam() {
        MovieManager movie = new MovieManager(10);

        MovieList[] actual = movie.findLast();
        MovieList[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

}