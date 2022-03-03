package com.syntax.class13;

public class MethodDemo3 {
    // int we specify the data type that method will return
    // squareTheNumber = name of the method
    // (int number) = parameter of the method
    // return tells java what to return from this method

    int squareTheNumber(int number){
        return number * number;
    }

    int returnTheSameNumber(int number){
        return number;
    }

    String giveName(String human, String animal){
        if(human.equalsIgnoreCase("Tehfur") && animal.equalsIgnoreCase("Horse")){
            return "Camel";
        } else {
            return "Not Camel";
        }
    }

    public static void main(String[] args) {
        // Create an object of the class
        MethodDemo3 obj = new MethodDemo3();
        // calling squareTheNumber method with number 5 using
        // object created above, assign it to (int result)
        int result = obj.squareTheNumber(5);
        // printing the result variable
        System.out.println(result);
    }

}
