package com.syntax.class20.Task;

public class PianoTeacher extends Teacher{
    String address;
    double weight;

    PianoTeacher(){

    }
    PianoTeacher(String name,String address, int age, double weight){
        this.name=name; this.address=address; this.age=age; this.weight=weight;
    }

    void printAddress(){
        System.out.println("Address: "+address);
    }
}
