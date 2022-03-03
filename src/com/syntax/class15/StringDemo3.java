package com.syntax.class15;

public class StringDemo3 {
    public static void main(String[] args) {
        String name ="How are @you guys @";
        System.out.println(name.indexOf("@"));

        System.out.println("name.lastIndexOf"+name.lastIndexOf("@"));
        System.out.println("name.indexOf(\"@\")"+name.indexOf("@"));
        System.out.println("name.indexOf(\"@\",0)"+name.indexOf("@", 8+1));
    }
}
