package com.syntax.class15;

import java.util.Scanner;

public class Task_Boy_Girl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // get the first name of father and mother
        // get the choice by or girl
        // if choice = boy, name =3firstCharOfFatherFirstName + 2LastCharOfMotherFirstName
        // if choice = girl, name = 2FirstCharOfMotherFirstName + 3LastCharOfFatherFirstName

        String father, mother, choice, name=" ";
        System.out.print("Mom's First Name: ");
        mother = input.nextLine();
        System.out.print("Dad's First Name: ");
        father = input.nextLine();
        System.out.print("Boy or Girl: ");
        choice = input.nextLine();
        if(choice.equalsIgnoreCase("boy")){
            // prepare boy name:
            String name_part1 = father.substring(0, 3);
            String name_part2 = mother.substring(mother.length()-2, mother.length());
            name = name_part1+name_part2;
        } else if(choice.equalsIgnoreCase("girl")){
            // prepare girl name:
            String name_part1 = mother.substring(0, 2);
            String name_part2 = father.substring(father.length()-3, father.length());
            name = name_part1+name_part2;
        } else System.out.println("Wrong choice!");
        System.out.println("Suggested Baby Name: "+name.toUpperCase());
    }
}
