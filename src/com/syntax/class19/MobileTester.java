package com.syntax.class19;

public class MobileTester {
    public static void main(String[] args) {
        // using constructor with zero arg
        Mobile m1 = new Mobile();
        m1.printInfo();
        System.out.println("-----------------");
        Mobile m2  = new Mobile("Samsung", "Galaxy", 1200);
        m2.printInfo();

    }
}
