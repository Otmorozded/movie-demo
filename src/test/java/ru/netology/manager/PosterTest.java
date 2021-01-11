package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterData;
import ru.netology.manager.PosterManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterTest {
    PosterManager manager = new PosterManager();

    PosterData movieToAdd1 = new PosterData(1, "title1", "genre1");
    PosterData movieToAdd2 = new PosterData(2, "title2", "genre2");
    PosterData movieToAdd3 = new PosterData(3, "title3", "genre3");
    PosterData movieToAdd4 = new PosterData(4, "title4", "genre4");
    PosterData movieToAdd5 = new PosterData(5, "title5", "genre5");
    PosterData movieToAdd6 = new PosterData(6, "title6", "genre6");
    PosterData movieToAdd7 = new PosterData(7, "title7", "genre7");
    PosterData movieToAdd8 = new PosterData(8, "title8", "genre8");
    PosterData movieToAdd9 = new PosterData(9, "title9", "genre9");
    PosterData movieToAdd10 = new PosterData(10, "title10", "genre10");
    PosterData movieToAdd11 = new PosterData(11, "11", "genre11");

    @BeforeEach
    void setup() {
        manager.addMovie(movieToAdd1);
        manager.addMovie(movieToAdd2);
        manager.addMovie(movieToAdd3);
        manager.addMovie(movieToAdd4);
        manager.addMovie(movieToAdd5);
        manager.addMovie(movieToAdd6);
        manager.addMovie(movieToAdd7);
        manager.addMovie(movieToAdd8);
        manager.addMovie(movieToAdd9);



    }


    @Test
    public void shouldAddMoviesEqualManagerLength() {
        manager.addMovie(movieToAdd10);
        PosterData[] actual = manager.getAllMovies(10);
        PosterData[] expected = new PosterData[]{movieToAdd10, movieToAdd9, movieToAdd8, movieToAdd7,
                movieToAdd6, movieToAdd5, movieToAdd4, movieToAdd3, movieToAdd2, movieToAdd1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void  shouldAddLastMovies() {

        manager.addMovie(movieToAdd10);
        PosterData[] actual = manager.getAllMovies(5);
        PosterData[] expected = new PosterData[] {movieToAdd10, movieToAdd9, movieToAdd8, movieToAdd7,
                movieToAdd6,};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowMoviesWithNegativeRequest() {


        PosterData[] actual = manager.getAllMovies(-1);
        PosterData[] expected = new PosterData[] { movieToAdd9, movieToAdd8, movieToAdd7,
                movieToAdd6, movieToAdd5, movieToAdd4, movieToAdd3, movieToAdd2, movieToAdd1};
        assertArrayEquals(expected, actual);


    }





}
