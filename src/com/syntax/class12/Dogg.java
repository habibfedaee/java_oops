package com.syntax.class12;

public class Dogg {
    String name, breed, color;
    int age; double weight;
    void eat(){
        System.out.println(name+" is eating");
    }
    void run(){
        System.out.println(name+" is running");
    }
    void sleep(){
        System.out.println(name+" is sleeping");
    }
    void bark(){
        System.out.println(name+" is barking");
    }
    public static void main(String[] args) {
        // Object husky
        Dogg husky = new Dogg();   husky.name = "husky";      husky.breed = "german shephard";     husky.color = "brown";
        husky.age = 12;         husky.weight=40;
        husky.eat(); husky.run(); husky.sleep(); husky.bark();

        // Object bullDog
        Dogg bullDog = new Dogg();     bullDog.name = "bullDog";     bullDog.breed = "gray hound";    bullDog.color = "gray";
        bullDog.age = 13;         bullDog.weight=45;
        bullDog.eat(); bullDog.run(); bullDog.sleep(); bullDog.bark();

        // labrador Object
        Dogg labrador = new Dogg();       labrador.name = "Lab";     labrador.breed = "British";     labrador.color = "white";
        labrador.age = 11;         labrador.weight=33;
        labrador.eat(); labrador.run(); labrador.sleep(); labrador.bark();
    }
}
