package com.syntax.class26;

import java.util.ArrayList;

public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Turkey");
        countries.add("Morocco");
        countries.add("Iraq");
        countries.add("GANA");
        countries.add("Eritea");
        countries.add("Afghanistan");
        System.out.println(countries.get(3));
//        System.out.println(countries.get(-1));

    }
}
