package com.syntax.class19;

public class Tester {
    public static void main(String[] args) {
        Horse horse = new Horse("jacky", 29, 300);
        // horse: Object/instance/reference variable/ variable
        horse.printHorseName();

        //creating object with zero argument constructor
//        Horse horse1 = new Horse();
//        horse1.printHorseName();

        Panda  p1 = new Panda(); // using default constructor
        p1.printInfo();
        System.out.println("---------------------------");
        // new Instance of Panda using the user defined constructor
        Panda p2 = new Panda("Mannys Panda", "RedPanda","Black&White", 5.2, 12, 300);
        p2.printInfo();


    }
}
