package com.syntax.class16;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = "123456! #asldkfj a!$#lsdkf adfs";
        System.out.println(str.replaceAll("[0-9]", "#")); // replaces number with #
        System.out.println(str.replaceAll("[0-9]", "")); // replaces number with nothing
        System.out.println(str.replaceAll("[a-z]", "")); // replaces lowercase chars with nothing
        System.out.println(str.replaceAll("[A-Z]", "")); // replaces uppercase chars with nothing
        System.out.println(str.replaceAll("[!-/]", "")); // replaces special chars with nothing
        System.out.println(str.replaceAll("[A-Za-z0-9]", ""));
        // replaces all uppercase, lowercase, numbers with nothing
        System.out.println(str.replaceAll("[^A-Za-z0-9]", ""));
        // replaces all other characters except uppercase, lowercase, numbers with nothing
        System.out.println(str.replaceAll("[^A-Za-z0-9]", ""));
        // replacea





    }
}
