package com.syntax.class22;

public class Shapee {
    double radius;
    Shapee(double radius){
        this.radius=radius;
    }
}
class Circlee extends  Shapee{

    Circlee(double radius) {
        super(radius);
    }

    void calculateArea(){

    }
}
class Tester{
    // Write a program: Shape class has a constructor that takes the radius and has a subclass as
    // circle class. in circle class create a method to calculate the area of a circle. Test your code.

    public static void main(String[] args) {
        int number = 10;
        boolean result = number>10? true: false;
    }


}