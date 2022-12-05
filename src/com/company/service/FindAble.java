package com.company.service;

import com.company.model.Cast;
import com.company.model.Movies;

import java.util.List;

public interface FindAble {
    void findMovieByName(List<Movies> movies);

    void findMovieByActor(List<Movies>movies);

    void findMovieByYear(List<Movies>movies);

    void findMovieByDirector(List<Movies>movies,String name);

    void findMovieByDescription(List<Movies>movies);

    void findMovieByRole(List<Movies>movies);
}
