package com.syntax.class28.Tasks;

import java.util.*;

public class Countries {
    public static void main(String[] args) {
        Set<String> countries = new TreeSet<>();
        countries.add("china");
        countries.add("afghanistan");
        countries.add("usa");
        countries.add("india");
        for (String country:
             countries) {
            System.out.print(country+", ");
        }
        System.out.println("\n--------------------------------");
        Iterator<String> itr = countries.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+", ");
        }

    }
}
