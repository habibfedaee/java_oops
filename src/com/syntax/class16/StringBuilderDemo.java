package com.syntax.class16;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String s = "Habib is Great";
        System.out.println(s.replace(" ", ""));
        System.out.println(s); // stays in original state

        // String builder class
        StringBuilder sb = new StringBuilder("Asghar is great");
        sb.append(" Haha, jokes.");
//        System.out.println(sb.reverse());
        System.out.println(sb);


    }
}
