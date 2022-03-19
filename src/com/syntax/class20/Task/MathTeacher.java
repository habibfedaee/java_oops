package com.syntax.class20.Task;

public class MathTeacher extends Teacher{
    String dob;
    double height;

    MathTeacher(){

    }
    MathTeacher(String name, String subject, int age, int id, String dob, double height){
        this.name=name; this.subject=subject; this.age=age; this.id=id;
        this.dob=dob; this.height=height;
    }

    void printSubject(){
        System.out.println("Subject: "+subject);
    }


}
