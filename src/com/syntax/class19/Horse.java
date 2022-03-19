package com.syntax.class19;

public class Horse {
    private String name;
    private int age;
    private double weight;

    // constructor, similar to method with class name and assign values to the fields
    Horse(String horseName, int horseAge, double horseWeight){
        name = horseName;
        age = horseAge;
        weight= horseWeight;
    }

    Horse(){
        name="Horse";
        age=0;
        weight=0.0;
    }

    // if constructor has no argument --> called zero argument constructor like:
    // Horse();

    void printHorseName(){
        System.out.println("Name: "+name);
    }

    void setName(String horseName){
        name = horseName;
    }
}
