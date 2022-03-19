package com.syntax.class19;

public class AnimalTester {
    public static void main(String[] args) {
        // Class Animal Obj created with full constructor:
        Animals cat = new Animals("Tom", "dark-gray", "breed",
                8, 15, 2.1);
        // accessed public printInfo from outside class
        cat.printInfo();

    }
}
