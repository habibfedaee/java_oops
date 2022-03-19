package com.syntax.class24;

public class Parent {
    void method() {
        System.out.println("I am  " + getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.method();

    }
}
