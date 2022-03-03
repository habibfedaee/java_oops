package com.syntax.class12;

public class Horse {
    String name, breed;
    int age;
    double weight;

    void run(){
        System.out.println(name+" is running");
    }

    void eat(){
        System.out.println(name+" is eating");
    }

    void neigh(){
        System.out.println(name+" is neighing");
    }
    void printCompleteInfo(){
        System.out.println("Name = "+name);
        System.out.println("Breed = "+breed);
        System.out.println("Age = "+age);
        System.out.println("Weight = "+weight);
    }

    public static void main(String[] args) {
        Horse doldol = new Horse();
        doldol.name = "Asb";
        doldol.breed = "Arabian";
        doldol.age = 20;
        doldol.weight= 400;
        doldol.printCompleteInfo();
        doldol.eat();
        doldol.run();
        doldol.neigh();
    }
}
