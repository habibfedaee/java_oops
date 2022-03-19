package com.syntax.class22.Task;

public class Shape {
    static double radius;
    Shape(){

    }
    Shape(double radius){
        this.radius=radius;
    }
}

class Circle extends Shape{
    static void calcArea(double radius){
        System.out.println("Radius: "+radius);
        System.out.println("Area: " + Math.PI *radius*radius);
    }

    public static void main(String[] args) {
        Shape shape = new Shape(12.0);
        calcArea(radius);
    }
}
