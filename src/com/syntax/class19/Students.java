package com.syntax.class19;

public class Students {
    String name="Ali";
    int math=75, english=90, biology=80;

    Students(){

    }
    Students(String name, int math, int english, int biology){
        this.name = name;
        this.math = math;
        this.english=english;
        this.biology=biology;
    }



    public  int averageScore(){
        return this.math+this.english+this.biology/3;
    }

    void printStudentGrade(){
        System.out.println("Name: "+this.name);
        System.out.println("\tMath: "+this.math);
        System.out.println("\tEnglish: "+this.english);
        System.out.println("\tBiology: "+this.biology);
        System.out.println("\tAverage: "+averageScore()+"\n");
    }
}
