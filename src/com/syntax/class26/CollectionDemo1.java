package com.syntax.class26;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionDemo1 {
    public static void main(String[] args) {
        String name = "yazgul";
        String name1 = "Farhad";
        // not scalable if we have to store large amount of data
        // arrays can be good option to tackle this problem
        //String[] names = {"yazgul", "andrew"};
        //names[2]="teyfur";
        String[] names2 = new String[100]; // not good
        names2[0]="elena";
        names2[1]="andrew";
//        System.out.println(Arrays.toString(names2));
        // solution is to use 'array list':
        ArrayList<String> syntaxStudents = new ArrayList<>();
        syntaxStudents.add("habib");
        syntaxStudents.add("ali");
        System.out.println(syntaxStudents.get(1));


    }
}
