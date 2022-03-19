package com.syntax.class24;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone = new Phone() {
            @Override
            public void ring() {
                System.out.println("ringing in Phone class");
            }
        };
        phone.ring();


    }
}
