package com.syntax.class19;

public class Animals {
    String name="name", color="color", breed="breed";
    int age=0;
    double weight=0.0, height=0.0;

    // zero argument constructor with public access modifier
    public Animals(){

    }
    // constructor with default access modifeir
    Animals(String name, String color, String breed, int age, double weight, double height){
        this.name = name; this.color = color; this.breed=breed; this.age=age;
        this.weight=weight; this.height = height;
    }
    // protected constructor with two args
    protected Animals(String name, String color){
        this.name=name; this.color=color;
    }
    // private constructor
    private Animals(String name, String breed, int age){
        this.name=name; this.breed = breed; this.age=age;
    }
    // public, so that everywhere objects could have access to printInfo method
    public void printInfo(){
        System.out.println("Animal Name: "+this.name);
        System.out.println("Color: \t\t"+this.color);
        System.out.println("Breed: \t\t"+this.breed);
        System.out.println("Age: \t\t"+this.age);
        System.out.println("Weight: \t"+this.weight);
        System.out.println("Height: \t"+this.height+"\n");
    }
}
