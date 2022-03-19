package com.syntax.class21;

public class SuperDemo1 {

}

class AAA{

    AAA(){

    }
}

class BBB extends AAA{
    String name;
    BBB(String name){
        super();
//        this();    // we cannot use this(); if not in first line of the current class
//        and inside the same constructor
        this.name = name;
    }
}
