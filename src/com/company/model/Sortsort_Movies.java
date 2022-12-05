package com.company.model;

import java.util.Comparator;

public class Sortsort_Movies implements Comparator<Movies> {
    @Override
    public int compare(Movies o1, Movies o2) {
        return 0;
    }
    public Comparator<Movies>sortByYear1 = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return o1.getYear() - o2.getYear();
        }
    };
    public Comparator<Movies>sortByYear2 = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return o2.getYear() - o1.getYear();
        }
    };
    public Comparator<Movies>sortByName1 = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public Comparator<Movies>getSortByName2 = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };
    public Comparator<Movies>SortByDirector1 = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return o1.getDirector().getName().compareTo(o2.getDirector().getName());
        }
    };
    public Comparator<Movies>SortByDirector2 = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return o2.getDirector().getName().compareTo(o1.getDirector().getName());
        }
    };


}
