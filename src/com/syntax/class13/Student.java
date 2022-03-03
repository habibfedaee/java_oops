package com.syntax.class13;
import java.util.Scanner;
public class Student {
    // class attributes
    int score;
    char grade;

    //method to determine grade based on score
    char getGrade(int score){

        if(score>90){
            grade='A';
        } else if(score>80){
            grade='B';
        } else if(score>70){
            grade='C';
        } else if(score>50){
            grade='D';
        } else {
            grade='F';
        }
        return grade;
    }
    // main method
    public static void main(String[] args) {
        Student st = new Student();
        System.out.print("Please enter your final score: ");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        char gr = st.getGrade(score);
        System.out.println("Your grade is: "+gr);
    }
}
