package com.syntax.class19;

public class Car {
    // attributes
    String name, make, color, type;

    // constructor
    Car(String name, String make, String color, String type){
        // by using this keyword we can refer to the class attribute variable names
        this.name = name;
        this.color = color;
        this.make = make;
        this.type = type;
    }


}
