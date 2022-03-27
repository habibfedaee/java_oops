package com.syntax.class27;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        HashSet<String> fruit = new LinkedHashSet<>();
        fruit.add("apple");
        fruit.add("mango");
        fruit.add("kiwi");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("apple"); // no duplicates allowed
        System.out.println(fruit);
    }
}
