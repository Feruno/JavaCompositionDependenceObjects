package org.example;

public class MovieManager {
    private MovieList[] movieListArr = new MovieList[0];

    private int count;

    public MovieManager() {
        this.count = 5;
    }

    public MovieManager(int count) {
        this.count = count;
    }

    public void addMovie(MovieList item) {
        MovieList[] tmp = new MovieList[movieListArr.length + 1];
        for (int i = 0; i < movieListArr.length; i++) {
            tmp[i] = movieListArr[i];
        }
        tmp[tmp.length - 1] = item;
        movieListArr = tmp;
    }

    public MovieList[] findAll() {
        return movieListArr;
    }

    public MovieList[] findLast() {
        if (movieListArr.length >= count) {
            this.count = count;
        } else {
            count = movieListArr.length;
        }
        MovieList[] tmp = new MovieList[count];
        int lastMovie = movieListArr.length;

        for (int i = 0; i < count; i++) {
            tmp[i] = movieListArr[lastMovie - 1 - i];
        }
        return tmp;
    }
}
