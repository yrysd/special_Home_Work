package com.company.service.impl;

import com.company.model.Cast;
import com.company.model.Movies;
import com.company.service.FindAble;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindByMap implements FindAble {
    private static final Scanner scanner = new Scanner(System.in);
    @Override
    public void findMovieByName(List<Movies> movies) {
        System.out.println("Write movie's name:");
        String name = scanner.nextLine();
        for (Movies movies1:movies) {
            if (name.equalsIgnoreCase(movies1.getName())) {
                movies1.methdo(name);
            }
        }

    }

    @Override
    public void findMovieByActor(List<Movies> movies) {
        int i = 0;
        System.out.println("Write actor's name:");
        String name = scanner.nextLine();
        for (Movies movies1:movies) {
            if(name.equalsIgnoreCase(movies1.getCasts().get(i).getActorFullName())){
                System.out.println(movies1);
            }
        }

    }

    @Override
    public void findMovieByYear(List<Movies> movies) {
        System.out.println("Write the year:");
        int year = scanner.nextInt();
        for (Movies movies1:movies) {
            if (year == movies1.getYear()) {
                System.out.println(movies1.findByYear2());
            }

        }

    }

    @Override
    public void findMovieByDirector(List<Movies> movies,String name) {
        for (Movies movies1:movies) {
            if(name.equalsIgnoreCase(movies1.getDirector().getName().trim())){
                System.out.println(movies1);
            }
        }




    }

    @Override
    public void findMovieByDescription(List<Movies> movies) {

    }

    @Override
    public void findMovieByRole(List<Movies> movies) {
        int i = 0;
        System.out.println("Write actor's name:");
        String name = scanner.nextLine();
        for (Movies movies1:movies) {
            if(name.equalsIgnoreCase(movies1.getCasts().get(i).getActorFullName())){
                System.out.println(movies1.findByActors());
            }
        }


    }
}
