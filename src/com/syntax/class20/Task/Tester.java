package com.syntax.class20.Task;

public class Tester {
    public static void main(String[] args) {
        // classA
        ClassA a = new ClassA();
        a.printF();

        // Teacher
        Teacher superTeacher = new Teacher("Name", "Subject", 22, 33);
        superTeacher.printInfo();

        // math teacher
        // (String name, String subject, int age, int id, String dob, int height)
        MathTeacher math = new MathTeacher("asghar", "math", 55, 11, "01-01-2001", 1.1);
        math.printSubject();

        // chemistry teacher
        // (String name, int age)
        ChemistryTeacher chemistry = new ChemistryTeacher("manana", 25);
        chemistry.printAge();

        // piano teacher
        // (String name,String address, int age, double weight)
        PianoTeacher piano = new PianoTeacher("zahn", "berlin", 55, 88.2);
        piano.printAddress();
    }
}
