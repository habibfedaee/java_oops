package com.syntax.GroupProject;

public interface Shape {
    public void calculateArea( double input);
    public void calculatePerimeter( double input);
}

class Circle implements Shape{

    @Override
    public void calculateArea(double input) {
        double PI= Math.PI;
        System.out.println(PI*input*input);
    }

    @Override
    public void calculatePerimeter(double input) {
        double PI= Math.PI;
        System.out.println(2*PI*input);
    }
}

class Square implements Shape{

    @Override
    public void calculateArea( double input) {
        System.out.println(input*input);
    }

    @Override
    public void calculatePerimeter( double input) {
        System.out.println(input*4);
    }
}