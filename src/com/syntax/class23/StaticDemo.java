package com.syntax.class23;

public class StaticDemo {

}

class Cat{
    static int NoOfLegs=4;
    String name;

    public void printInfo(){
        System.out.println(NoOfLegs);
    }

    public static void print(){
        System.out.println(NoOfLegs);
    }
}