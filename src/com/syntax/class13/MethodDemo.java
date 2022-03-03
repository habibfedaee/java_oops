package com.syntax.class13;

import java.util.Scanner;

public class MethodDemo {
    //method with parameter
    void checkEvenOdd(int number){
        if(number%2==0){
            System.out.println(number+" is Even");
        } else{
            System.out.println(number+" is Odd");
        }
    }

    public static void main(String[] args) {
        MethodDemo md = new MethodDemo();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        md.checkEvenOdd(num);

    }
}
