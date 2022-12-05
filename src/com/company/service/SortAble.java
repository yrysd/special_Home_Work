package com.company.service;

import com.company.model.Movies;

import java.util.LinkedList;
import java.util.List;

public interface SortAble {

    void sortByMovieName(List<Movies> moviesList);

    void sortByYear(List<Movies>moviesList);

    void sortByDirector(List<Movies>moviesList);

    void sortByActor(List<Movies>moviesList);
}
