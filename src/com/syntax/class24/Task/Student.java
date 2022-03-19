package com.syntax.class24.Task;

public class Student {
    void study(){
        System.out.println("students must study to pass");
    }
    void doHomeWork(){
        System.out.println("students must do homeworks");
    }
    void practice(){
        System.out.println("students must practice");
    }
}
class SyntaxStudent extends Student{
    void study(){
        System.out.println("Syntax students must study 25 hours / week");
    }
    void doHomeWork(){
        System.out.println("Syntax students must solve Repls");
    }

    @Override
    void practice() {
        System.out.println("Syntax students must do their own research");
    }
}
class CollegeStudent extends Student{
    @Override
    void doHomeWork() {
        System.out.println("College students can skip some the homeworks");
    }
}
class SchoolStudent extends Student{

}
