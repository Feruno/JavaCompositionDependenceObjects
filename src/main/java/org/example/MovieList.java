package org.example;

public class MovieList {
    private int id;
    private String movieGenre;
    private String movieName;
    private int count;

    public MovieList() {
    }

    public MovieList(int id, String movieGenre, String movieName, int count) {
        this.id = id;
        this.movieGenre = movieGenre;
        this.movieName = movieName;
        this.count = count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMovieId(int movieId) {
        this.movieGenre = movieGenre;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public String getMovieId() {
        return movieGenre;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getCount() {
        return count;
    }
}
