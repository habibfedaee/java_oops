package com.syntax.class20.Task;

public class ChemistryTeacher extends Teacher{
    char gender;

    ChemistryTeacher(){

    }
    ChemistryTeacher(String name, int age){
        this.name=name; this.age=age;
    }

    void printAge(){
        System.out.println("Age: "+age);
    }
}
