package com.syntax.class22.Task;

public class Task1 {
    public static void main(String[] args) {
        Programming prog = new Programming("Java");
    }
}

class Programming{
    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String str){
        System.out.println("I love programming with "+str);
    }
}
