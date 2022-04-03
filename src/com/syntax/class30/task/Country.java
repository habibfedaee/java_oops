package com.syntax.class30.task;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Country {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("France", "Paris");
        countries.put("Germany", "Berlin");
        countries.put("USA", "Washington");
        countries.put("Korea", "Soel");
        System.out.println("--------Using For-------------");
        for(Map.Entry<String, String> entry: countries.entrySet()){
            System.out.print(entry.getKey()+" ");
            System.out.println(entry.getValue());
        }
        // same in iterator
        System.out.println("--------Using Iterator-------------");
        Iterator<Map.Entry<String, String>> itr = countries.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String,String> entry = itr.next();
            System.out.println(entry);
        }
        // part two
        System.out.println("--------Using Foreach-------------");
        for(String value: countries.values()){
            System.out.println(value);
        }
    }
}
