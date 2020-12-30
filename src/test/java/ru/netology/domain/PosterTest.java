package ru.netology.domain;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class PosterTest {

    PosterManager posterManager = new PosterManager();

    @Test

    void shouldAddMovie() {

        PosterData movieToAdd = new PosterData(10, "title10", "genre10");
        posterManager.addMovie(movieToAdd);
        PosterData[] actual = posterManager.getAllMovies(10);
        PosterData[] expected = {

                new PosterData(10,"title10", "genre10"),
                new PosterData(9,"title9", "genre9"),
                new PosterData(8,"title8", "genre8"),
                new PosterData(7,"title7", "genre7"),
                new PosterData(6,"title6", "genre6"),
                new PosterData(5,"title5", "genre5"),
                new PosterData(4,"title4", "genre4"),
                new PosterData(3,"title3", "genre3"),
                new PosterData(2,"title2", "genre2"),
                new PosterData(1,"title1", "genre1"),

        };

        assertArrayEquals(expected, actual);
    }




}
