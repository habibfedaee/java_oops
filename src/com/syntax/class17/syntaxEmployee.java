package com.syntax.class17;

public class syntaxEmployee {
    int empID, salary;
    static String CEO = "Sumair";

    public static void main(String[] args) {
        syntaxEmployee employee1 = new syntaxEmployee();
        employee1.empID= 100;
        employee1.salary=3500;
        System.out.println("Employee ID: \t\t"+employee1.empID);
        System.out.println("Employee Salary: \t"+employee1.salary);
        System.out.println("Employee CEO: \t\t"+CEO);

        System.out.println("--------------------------");

        syntaxEmployee employee2 = new syntaxEmployee();
        employee2.empID = 101;
        employee2.salary= 4000;
        System.out.println("Employee ID: \t\t"+employee2.empID);
        System.out.println("Employee Salary: \t"+employee2.salary);
        System.out.println("Employee CEO: \t\t"+CEO);

    }

}
