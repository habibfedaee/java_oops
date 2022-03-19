package com.syntax.class24.Task;

public class Tester {
    public static void main(String[] args) {
//        SyntaxStudent ss = new SyntaxStudent();
//        ss.study(); // line 16 of SyntaxStudent
//
//        Student syntanxStudent = new SyntaxStudent();
//        Student schoolStudent = new SchoolStudent();
        // create array of students: by using  new keyword
        Student[] students = {new SyntaxStudent(), new SchoolStudent(), new CollegeStudent()};
        // we can loop through students array as following:
        for(Student student: students){
            student.study();
        }

    }
}
