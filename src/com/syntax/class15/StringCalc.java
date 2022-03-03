package com.syntax.class15;

public class StringCalc {
    public static void main(String[] args) {
        // Create a String and if the String is not empty then,
        // if the String has an odd number of chars and has 3 or more chars,
        // print the character in the middle of the string

        String str = "STRINGS";
        System.out.println(str);
        if(str.length()%2!=0 && str.length()>=3){
            int middle = str.length()/2;
            System.out.println("Middle Char: "+str.charAt(middle));
        } else {
            System.out.println("String even!");
        }
    }
}
