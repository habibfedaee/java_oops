package com.syntax.class12;

public class Dog {
    // attributes:
    String name, color, breed;
    char gender;
    int age;
    double weight;

    // behaviors
    void bark(){
        System.out.println("Dog is barking");
    }

    void eat(){
        System.out.println("Dog is eating");
    }

    void sleep(){
        System.out.println("Dog is sleeping");
    }

    public static void main(String[] args) {
        Dog scooby = new Dog();
        scooby.eat();
        scooby.sleep();
        scooby.bark();
    }
}
