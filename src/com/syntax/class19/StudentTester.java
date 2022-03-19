package com.syntax.class19;

public class StudentTester {
    public static void main(String[] args) {
        // zero arg constructor:
        Students st1 = new Students();
        st1.averageScore();
        st1.printStudentGrade();

        Students st2 = new Students("Anton", 95, 99, 80);
        st2.averageScore();
        st2.printStudentGrade();

        Students st3 = new Students("Asghar", 25, 29, 20);
        st3.averageScore();
        st3.printStudentGrade();

        Students st4 = new Students("Manny", 96, 95, 85);
        st4.averageScore();
        st4.printStudentGrade();

        Students st5 = new Students("Emilia", 95, 99, 98);
        st5.averageScore();
        st5.printStudentGrade();

        

    }
}
