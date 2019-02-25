package com.sergio.examenmovies;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getMovies_method_returns_a_six_size_list() {
        //List<Movies> movies=Movies.getMovies();
        //int size=movies.size();
        assertEquals(6, Movies.getMovies().size());

    }


}