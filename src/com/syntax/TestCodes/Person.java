package com.syntax.TestCodes;

public class Person{
    String name;
    String lastName;
    int age;
    Person(){

    }
    Person(String name, String lastName, int age){
        this.name=name; this.lastName=lastName;
        this.age=age;
    }

}

class Employee extends Person{
    int salary;
    Employee(String name, String lastName, int age, int salary){
        this.name=name; this.lastName=lastName; this.age=age; this.salary=salary;
    }

    public Employee() {

    }

    public void printInfo(){

        System.out.println( name+" "+lastName+" "+age+" "+salary);
    }
}

class Student extends Employee{
    int grade;
    Student(String name, String lastName, int age, int grade){
        super();
        this.name=name; this.lastName=lastName; this.age=age;
        this.grade=grade;
    }

    public Student() {

    }

    public void printInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+grade);

    }
}

class Retiree extends Student{
    String seniorActivity;
    Retiree(String name, String lastName, int age, String seniorActivity){
        super();
        this.name=name; this.lastName=lastName; this.age=age;
        this.seniorActivity=seniorActivity;
    }
    public void printInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);

    }
}