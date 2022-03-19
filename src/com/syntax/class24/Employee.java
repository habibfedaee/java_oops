package com.syntax.class24;

public interface Employee {
    public static final int age =40;
    void work();

    // all the methods inside an interface which do not have body are abstract and public

}
class Testerr implements Employee{

    @Override
    public void work() {
        System.out.println("testing a website");
    }

    public static void main(String[] args) {
        Testerr testerr = new Testerr();
        testerr.work();
        System.out.println(Employee.age);
    }
}