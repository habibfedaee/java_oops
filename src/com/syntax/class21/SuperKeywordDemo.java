package com.syntax.class21;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.printColor();
    }
}
class Parent{
    String color = "black";
}
class Child extends Parent{
    String color ="red";

    void printColor(){
        System.out.println(color);
    }
}
