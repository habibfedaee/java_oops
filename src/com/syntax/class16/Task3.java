package com.syntax.class16;

public class Task3 {
    public static void main(String[] args) {
        String s = "Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(s.length()); // .length() works with String type
//        System.out.println(s.length ); // .length works with arrays
        System.out.println(s.split("[?]").length);

    }
}
