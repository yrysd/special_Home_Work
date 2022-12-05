package com.company.model;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Movies   {
    private static final Scanner scanner = new Scanner(System.in);
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> casts;

    public Movies(String name, int year, String description, Director director, List<Cast> casts) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.casts = casts;
    }
    public Movies(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCasts() {
        return casts;
    }

    public void setCasts(List<Cast> casts) {
        this.casts = casts;
    }

    @Override
    public String toString() {
        return
                "\nName: " + name + "\n" +
                "Year: " + year + "\n" +
                "Description: "+description+"\n"+
                director+"\n"+
                "* Cast of "+name+" * "+"\n"+
                casts+"\n"+
                        "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
    public void methdo(String name){
        if(name.equalsIgnoreCase(this.name)){
            System.out.println(infoMethod());
        }
    }
    public String  infoMethod(){
        return "\n Name: "+name+"\n"+
                "Year: "+year+"\n"+
                "Description: "+description+"\n"+
                director+"\n"+
                "* Cast of "+name+" * "+"\n"+
                casts;
    }
    public String  moviesSortMethod(){
        return "\nYear: "+year+"\n"+
                "Name: "+name+"\n"+
                "Description: "+description+"\n"+
                description+"\n"+
                "* Cast of "+name+" * "+"\n"+
                casts+"\n"+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

    }
    public String DirectorSortMethod(){
        return director+"\n"+
                "Name: "+name+"\n"+
                "Year: "+year+"\n"+
                "Description: "+description+"\n"+
                "* Cast of "+name+" * "+"\n"+
                casts+"\n"+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
//    public void ActorNameMethod(List<Movies>movies){
//        int i = 0;
//        System.out.println("Write actor's name:");
//        String name = scanner.nextLine();
//        for (Movies movies1:movies) {
//            if(name.equalsIgnoreCase(movies1.getCasts().get(i).getActorFullName())){
//                System.out.println(ActorsNameInfo());
//            }
//        }
//
//    }
    public String ActorsNameInfo(){
        return "Name: "+name+"\n"+
                "Year: "+year+"\n"+
                "Description: "+description+"\n"+
                "* Cast of "+name+" * "+"\n"+
                casts+"\n"+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }

    public String findByYear2(){
        return "Year: "+year+"\n"+
                director+"\n"+
                "Name: "+name+"\n"+
                "Description: "+description+"\n"+
                "* Cast of "+name+" * "+"\n"+
                casts+"\n"+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
    public String findByActors(){

        return  "-----------------------------------------------------------------"+"\n"+
                "                        Actor: "+casts+"\n"+
                "------------------------------------------------------------------"+"\n"+
                "Movie: "+name+"\n"+
                "Role: "+casts+"\n"+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
    public String actorsSort(){
        return casts+"\n"+
                "Movie: "+description+"\n"+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

    }



}
