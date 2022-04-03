package com.syntax.class28.Tasks;
import java.util.HashSet;
import java.util.Set;

public class Student {
    int studentID;  String studentName;
    Student(int id, String name){
        this.studentID=id; this.studentName=name;
    }
}

class StudentSet extends Student{
    StudentSet(int id, String name)
    { super(id, name); }
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student(3, "Ahmad"));
        studentSet.add(new Student(2, "John"));
        studentSet.add(new Student(1, "Abaas"));
        studentSet.add(new Student(4, "David"));
        for (Student st: studentSet) {
            System.out.println(st.studentName);
        }
    }
}