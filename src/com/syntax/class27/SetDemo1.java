package com.syntax.class27;

import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {

        // no insertion order
        // no duplicates
        HashSet<String> fruit = new HashSet<>();
        fruit.add("apple");
        fruit.add("mango");
        fruit.add("kiwi");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("apple");

        System.out.println(fruit);
    }
}
