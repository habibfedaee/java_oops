package com.syntax.GroupProject;

public class MarksTest {
    public static void main(String[] args) {
        A studentA = new A(new int[]{88, 90, 77});
        double a_percentage =studentA.getPercentage(studentA.subjects);
        System.out.println("Student A percentage: "+a_percentage);

        B studentB = new B(new int[]{99, 80, 87});
        double b_percentage =studentB.getPercentage(studentB.subjects);
        System.out.println("Student B percentage: "+b_percentage);
    }
}
