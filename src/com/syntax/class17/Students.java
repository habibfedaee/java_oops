package com.syntax.class17;

public class Students {
    String name;      int ID;        static int numberOfStudents=0;
    public static void main(String[] args) {
        System.out.println("<< Students >>");

        Students st1 = new Students();
        st1.name="Ali";         st1.ID=123;
        Students.numberOfStudents++;
        System.out.println("Student Name: \t"+st1.name);
        System.out.println("Student ID: \t"+st1.ID);
        System.out.println("-------------------------");

        Students st2 = new Students();
        st2.ID = 124;         st2.name = "Jawed";
        Students.numberOfStudents++;
        System.out.println("Student Name: \t"+st2.name);
        System.out.println("Student ID: \t"+st2.ID);
        System.out.println("-------------------------");

        Students st3 = new Students();
        st3.ID = 125;         st3.name = "Mahdi";
        Students.numberOfStudents++;
        System.out.println("Student Name: \t"+st3.name);
        System.out.println("Student ID: \t"+st3.ID);
        System.out.println("----------------------------");
        System.out.println("Total number of Students: "+numberOfStudents);
    }
}
