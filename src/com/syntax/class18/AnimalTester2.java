package com.syntax.class18;

import com.syntax.class19.Animals;

public class AnimalTester2 {
    public static void main(String[] args) {
        // created an object of animal using default constructor with public access mod
        Animals dog = new Animals();
        // called the printInfo method with public access modifier, from outside package
        dog.printInfo();
    }
}
