package com.syntax.class17;

import com.syntax.class18.AccessModifiers;

public class AccessModifierTester {

    public static void main(String[] args) {
        AccessModifiers am = new AccessModifiers();
//        System.out.println(am.name); // cannot access am.name because of private access keyword
//        System.out.println(am.age); // cannot be accessed because of not in the same package
//        System.out.println(am.weight); // cannot be accessed because of protected keyword
        System.out.println(am.color);
    }
}
