package com.company.service.impl;

import com.company.model.Movies;

import com.company.model.Sortsort_Movies;
import com.company.service.SortAble;

import java.util.*;

public class MovieStore implements SortAble {

    private static final Scanner scanner = new Scanner(System.in);



    @Override
    public void sortByMovieName(List<Movies> moviesList) {
        System.out.println("Press 1 to sort by ascending");
        System.out.println("Press 2 to sort by descending");
        int number = scanner.nextInt();
        if (number == 1) {
            Sortsort_Movies sortsort = new Sortsort_Movies();
            moviesList.sort(sortsort.sortByName1);
            for (Movies movies:moviesList) {
                System.out.println(movies);
            }
        }else{
            Sortsort_Movies sortsort = new Sortsort_Movies();
            moviesList.sort(sortsort.getSortByName2);
            for (Movies movies:moviesList) {
                System.out.println(movies);
            }
        }

    }

    @Override
    public void sortByYear(List<Movies> moviesList) {
        System.out.println("Press 1 to sort by ascending");
        System.out.println("Press 2 to sort by descending");
        int number = scanner.nextInt();
        if (number == 1) {
            Sortsort_Movies sortsort = new Sortsort_Movies();
            moviesList.sort(sortsort.sortByYear1);

            for (Movies movies:moviesList) {
                System.out.println(movies.moviesSortMethod());
            }
        }else {
            Sortsort_Movies sortsort = new Sortsort_Movies();
            moviesList.sort(sortsort.sortByYear2);
            for (Movies movies:moviesList) {
                System.out.println(movies.moviesSortMethod());
            }
        }


    }

    @Override
    public void sortByDirector(List<Movies> moviesList) {
        System.out.println("Press 1 to sort by ascending");
        System.out.println("Press 2 to sort by descending");
        int number = scanner.nextInt();
        if (number == 1) {
            Sortsort_Movies sortsort_movies = new Sortsort_Movies();
            moviesList.sort(sortsort_movies.SortByDirector1);
            for (Movies movies:moviesList) {
                System.out.println(movies.DirectorSortMethod());
            }
        }else {
            Sortsort_Movies sortsort_movies = new Sortsort_Movies();
            moviesList.sort(sortsort_movies.SortByDirector2);
            for (Movies movies:moviesList) {
                System.out.println(movies.DirectorSortMethod());
            }
        }


    }

    @Override
    public void sortByActor(List<Movies> moviesList) {
        for (Movies movies:moviesList) {
            System.out.println(movies.actorsSort());
        }

    }
}
