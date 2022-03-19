package com.syntax.class20.Task;

public class Teacher {
    String name, subject;
    int age, id;

    Teacher(){

    }
    Teacher(String name, String subject, int age, int id){
        this.name = name; this.subject=subject; this.age=age; this.id=id;
    }
    void printInfo(){
        System.out.println(this.name+" "+this.subject+" "+this.age+"");
    }
}
