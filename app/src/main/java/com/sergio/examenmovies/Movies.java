package com.sergio.examenmovies;

import java.util.ArrayList;
import java.util.List;

public class Movies {
    private String Name;
    private String Director;
    private int Year;
    private String Genres;
    private double Rate;
    private String Thumbnail;

    public Movies() {
    }

    public Movies(String name, String director, int year, String genres, double rate, String thumbnail) {
        Name = name;
        Director = director;
        Year = year;
        Genres = genres;
        Rate = rate;
        Thumbnail = thumbnail;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getGenres() {
        return Genres;
    }

    public void setGenres(String genres) {
        Genres = genres;
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double rate) {
        Rate = rate;
    }

    public String getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        Thumbnail = thumbnail;
    }

    public static List<Movies> getMovies() {
        List<Movies> movies = new ArrayList<>();

        movies.add(new Movies(
                "Peleando en familia",
                "Stephen Merchant",
                2019,
                "Biografía, Comedia, Drama",
                7.8,
                "https://m.media-amazon.com/images/M/MV5BMjQ3MTk4Nzc1M15BMl5BanBnXkFtZTgwMTEwMDU5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg"));
        movies.add(new Movies(
                "La LEGO película 2",
                "Mike Mitchell",
                2019,
                "Animación, Acción, Aventura",
                7.1,
                "https://m.media-amazon.com/images/M/MV5BMTkyOTkwNDc1N15BMl5BanBnXkFtZTgwNzkyMzk3NjM@._V1_UY209_CR0,0,140,209_AL_.jpg"));
        movies.add(new Movies(
                "What men want",
                "Adam Shankman",
                2019,
                "Comedia, Fantasía, Romance",
                4.2,
                "https://m.media-amazon.com/images/M/MV5BMTYxNjE2NjIwOF5BMl5BanBnXkFtZTgwMjE0MzkxNzM@._V1_UY209_CR0,0,140,209_AL_.jpg"));
        movies.add(new Movies(
                "Feliz día de tu muerte 2",
                "Christopher Landon",
                2019,
                "Drama, Horror, Misterio",
                6.7,
                "https://m.media-amazon.com/images/M/MV5BMTg0NzkwMzQyMV5BMl5BanBnXkFtZTgwNDcxMTMyNzM@._V1_UX140_CR0,0,140,209_AL_.jpg"));
        movies.add(new Movies(
                "Venganza bajo cero",
                "Hans Petter Moland",
                2019,
                "Acción, Drama, Thriller",
                6.7,
                "https://m.media-amazon.com/images/M/MV5BM2YyYWI3NjItMWEwZS00MzhkLWJmZTMtZDAzYjRhODM0OTMzXkEyXkFqcGdeQXVyMjM4NTM5NDY@._V1_UX140_CR0,0,140,209_AL_.jpg"));
        movies.add(new Movies(
                "The Upside",
                "Neil Burger",
                2017,
                "Comedia, Drama",
                6.3,
                "https://m.media-amazon.com/images/M/MV5BNzY3NzYyNjI0N15BMl5BanBnXkFtZTgwNjYzMDc0NjM@._V1_UY209_CR0,0,140,209_AL_.jpg"));

        return movies;
    }
}
