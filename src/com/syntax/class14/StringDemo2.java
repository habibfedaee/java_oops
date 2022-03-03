package com.syntax.class14;

public class StringDemo2 {

    public static void main(String[] args) {
        String name = "  Shakila   ";

        // Method String.trim(); remove extra spaces from a string
        System.out.println(name.trim());

        // Method boolean startsWith(String); returns boolean if a string starts with given substring
        String name2 = "Run Shakila";
        if(name2.startsWith("Run")){
            System.out.println("Faster!");
        }

    }
}
