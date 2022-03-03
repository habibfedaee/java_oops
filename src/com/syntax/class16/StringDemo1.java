package com.syntax.class16;

public class StringDemo1 {
    public static void main(String[] args) {
        // string replace method
        String str = "Batch 12 is good";
        System.out.println(str.replace("good", "great"));
        System.out.println(str.replace("o", "0"));
        String str2 = str.replace("good", "great");
        System.out.println(str2);

    }
}
