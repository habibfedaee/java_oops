package com.syntax.class21;

public class Test {

    String censorLetter(String str, String c){
        return str.replaceAll(c, "*");
    }



    public static void main(String[] args){
        Test test = new Test();
        System.out.println(test.censorLetter("hello", "l"));

    }


}
