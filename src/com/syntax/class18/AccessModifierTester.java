package com.syntax.class18;

public class AccessModifierTester {



    public static void main(String[] args) {
        AccessModifiers am = new AccessModifiers();
        //System.out.println(am.name); // cannot access am.name because of private access keyword
        System.out.println(am.age);
        System.out.println(am.weight);
        System.out.println(am.color);
    }
}
