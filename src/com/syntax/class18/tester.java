package com.syntax.class18;

import java.util.Scanner;

public class tester {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("The first 3 letters of "+str+" is "+str.substring(0,3));
    }
}
