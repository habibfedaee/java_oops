package com.syntax.class12;
import java.util.Scanner;

public class Calc {
    double num1, num2;
    int operation;

    double add(){
         return num1+num2;
    }
    double subtract(){
          return  num1-num2;
    }
    double divide(){
          return num1/num2;
    }
    double multiply(){
          return num1*num2;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to java calculator");
        System.out.println(" 1(Add), 2(Subtract), 3(Multiply), 4(Divide)");
        System.out.println("Please enter the first number: ");
        calc.num1 = input.nextDouble();
        System.out.println("Select Operator(1, 2, 3, 4)");
        calc.operation = input.nextInt();
        System.out.println("Please enter the second number: ");
        calc.num2 = input.nextDouble();
        switch (calc.operation) {
            case 1 -> System.out.println("Result: " + calc.add());
            case 2 -> System.out.println("Result: " + calc.subtract());
            case 3 -> System.out.println("Result: " + calc.multiply());
            case 4 -> System.out.println("Result: " + calc.divide());
            default -> System.out.println("Wrong input for operation");
        }
    }


}
