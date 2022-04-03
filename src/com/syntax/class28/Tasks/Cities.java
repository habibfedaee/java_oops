package com.syntax.class28.Tasks;

import java.util.*;

public class Cities {
    public static void main(String[] args) {
        // add cities to set 'cities'
        // insertion order required --> LinkedHashSet
        Set<String> cities = new LinkedHashSet<>();
        cities.add("LA");
        cities.add("NY");
        cities.add("SF");
        cities.add("NJ");
        cities.add("AT");
        System.out.println(cities);
        Iterator<String> itr = cities.iterator();
        while(itr.hasNext()){
            if(itr.next().startsWith("A")){
                itr.remove();
            }
        }
        System.out.println(cities);

    }
}
