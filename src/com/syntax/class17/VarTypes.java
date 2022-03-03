package com.syntax.class17;

public class VarTypes {
    String name; // instance var
    String color; // instance var
    static int numberOfLegs=4;  // static var
    void eat(){
        int noOfTimes = 3; // local var
        System.out.println(name+ " eats "+noOfTimes);
    }

    public static void main(String[] args) {
        VarTypes dog = new VarTypes();
        dog.name = "scooby"; dog.color = "pink";
        VarTypes.numberOfLegs=5;
        dog.eat();
    }
}
