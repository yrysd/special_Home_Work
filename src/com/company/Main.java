package com.company;

import com.company.model.Cast;
import com.company.model.Director;
import com.company.model.Movies;
import com.company.service.FindAble;
import com.company.service.SortAble;
import com.company.service.impl.FindByMap;
import com.company.service.impl.MovieStore;

import java.util.*;

public class Main {

    private static List<Movies> movies = new ArrayList<>();
    private static final SortAble s = (SortAble) new MovieStore();
    private static final FindAble f = (FindAble) new FindByMap();
    private static final Scanner in  = new Scanner(System.in);
    private static final Scanner string = new Scanner(System.in);


    public static void main(String[] args) {


        List<Cast>casts = new LinkedList<>(Arrays.asList(new Cast("David Tennant","Crowley")));
        List<Cast>casts1 = new LinkedList<>(Arrays.asList(new Cast("SomeGirl","Angry Fae")));
        List<Cast>casts2 = new LinkedList<>(Arrays.asList(new Cast("Daniel Radcliffe","Harry Potter")));
        List<Cast>casts3 = new LinkedList<>(Arrays.asList(new Cast("Richard Armitage","Thorin")));
        List<Cast>casts4 = new LinkedList<>(Arrays.asList(new Cast("Lee Pace","Thranduil")));
        List<Cast>casts5 = new LinkedList<>(Arrays.asList(new Cast("Lee Pace","Thranduil")));
        List<Cast>casts6 = new LinkedList<>(Arrays.asList(new Cast("Chris Hemsworth","Thor")));
        List<Cast>casts7= new LinkedList<>(Arrays.asList(new Cast("Una Stubbs","Mrs. Hudson")));

      movies = new ArrayList<>(Arrays.asList(
               new Movies("Good omens",2019,"TV Series",new Director("Douglas","Mackinnon"),casts),
               new Movies("Carnival Row",2019,"TV Series",new Director("Some","Director"),casts1),
               new Movies("Harry Potter",2005,"Movie",new Director("Happy ","Guy"),casts2),
               new Movies("Hobbit: An Unexpected Journey",2012,"Movie",new Director("Poter","Jackson"),casts3),
               new Movies("The Desolation of Smaug",2013,"Movie",new Director("Peter","Jackson"),casts4),
               new Movies("The Battle of the Five Armies",2014,"Movie",new Director("Peter","Jackson"),casts5),
               new Movies("Avengers: Endgame",2019,"Movie",new Director("Anthony ","Russo"),casts6),
               new Movies("Sherlock: Season1",2010,"TV Series",new Director("Paul","McGuigan"),casts7)

       ));

            Commands();
















    }
    public static void Commands(){



        while (true) {
            System.out.println("=============================Commands=============================");
            System.out.println("Press 1 to print catalog");
            System.out.println("Press 2 to find a movie by full or part name");
            System.out.println("Press 3 to sort by year");
            System.out.println("Press 4 to sort by name");
            System.out.println("Press 5 to sort by director");
            System.out.println("Press 6 to find movies by actor's name");
            System.out.println("Press 7 to movies by director's name");
            System.out.println("Press 8 to find movies by year");
            System.out.println("Press 9 to list all movies and roles by actor's name");
            System.out.println("Press 10 to sort list of all actors with his roles");
            System.out.println("==================================================================");


            start();
        }




    }
    public static void start(){

        Scanner scanner = new Scanner(System.in);
            int one = in.nextInt();
            if (one == 1) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~ * All Movies * ~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(movies);
            } else if (one == 2) {
                f.findMovieByName(movies);
            } else if (one == 3) {
                s.sortByYear(movies);
            }else if(one == 4){
                s.sortByMovieName(movies);
            } else if (one == 5) {
                s.sortByDirector(movies);
            } else if (one == 6) {
                f.findMovieByActor(movies);
            } else if (one == 7) {
                System.out.println("Write director's name:");
                String name =scanner.nextLine();
                f.findMovieByDirector(movies,name);
            } else if (one == 8) {
                f.findMovieByYear(movies);
            } else if (one == 9) {
                f.findMovieByRole(movies);
            }else if(one == 10){
                s.sortByActor(movies);
            }


        }

    }
