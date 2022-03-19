package com.syntax.class22.Task;

public class Task2 {
    // create 1 class with a static method that has 3 overloaded forms.
    // then call each overloaded method with specific arguments and observe the results.

    public static void method(String name) {
        System.out.println("method 1: "+name);
    }
    public static void method(boolean bol) {
        System.out.println("method 2: "+bol);
    }
    public static void method(int number) {
        System.out.println("method 3: "+number);
    }

    public static void main(String[] args) {
        method("Asel");
        method(true);
        method(3);
    }
}
