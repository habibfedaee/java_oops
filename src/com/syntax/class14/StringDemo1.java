package com.syntax.class14;

import java.util.Locale;

public class StringDemo1 {


    public static void main(String[] args) {

        // string can be created in two ways
        String name = "Ali";
        String naam = new String("Ali");

        // String method .length() shows the number of characters inside a string
        int len = name.length();

        // String method toLowerCase(), converts the upper case characters to lower
        System.out.println(name.toLowerCase()); // converts to lowercase
        System.out.println(name.toUpperCase()); // converts to uppercase



        String str = "    ";
        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());
    }

}
