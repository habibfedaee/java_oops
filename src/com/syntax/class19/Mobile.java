package com.syntax.class19;

public class Mobile {
    String make="Apple", model="iphone"; int price=1200;

    // zero arg constructor:
    Mobile(){

    }
    Mobile(String make, String model, int price){
        this.make = make;
        this.model = model;
        this.price = price;
    }
    void printInfo(){
        System.out.println("Make: "+this.make);
        System.out.println("Model: "+this.model);
        System.out.println("Price: "+this.price);
    }
}
