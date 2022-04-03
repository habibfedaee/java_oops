package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        // hashmap contains keys and values
        HashMap<Integer, String> names = new HashMap<>();
        names.put(12234234, "name 1");
        names.put(123456, "name 2");
        System.out.println(names.get(12234234));
    }
}
