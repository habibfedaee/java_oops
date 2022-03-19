package com.syntax.class19;

public class Panda {
    String name = "Poe";
    String breed =  "Red Panda";
    String color = "red";
    double weight = 143.2;
    double height = 2.2;
    int age = 12;
    Panda() {
    }

    Panda(String pandaName){
        name = pandaName;
    }
    Panda(String pandaName, String pandaBreed){
        name = pandaName;
        breed=pandaBreed;
    }
    Panda(String pandaName, String pandaBreed, String pandaColor, double pandaHeight, int pandaAge, double pandaWeight){
        name = pandaName; breed = pandaBreed; color = pandaColor; height=pandaHeight; age = pandaAge; weight= pandaWeight;
    }

    void printInfo(){
        System.out.println("Name "+this.name);
        System.out.println("Breed "+this.breed);
        System.out.println("Color "+this.color);
        System.out.println("Height "+this.height);
        System.out.println("Weight "+this.weight);
        System.out.println("Age "+this.age);

    }
}

