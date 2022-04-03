package com.syntax.class30;

import java.security.Key;
import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
//        fruitMap.put("Apple", 20);   // auto-casting does not work in collections and maps
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 18.1);
        fruitMap.put("Orange", 15.3);
        fruitMap.put("Kiwi", 12.8);
        fruitMap.put("Mango", 20.0);
        fruitMap.put("Banana", 10.5);  //duplicate values are overridden, last value is retained

        System.out.println(fruitMap);
        System.out.println(fruitMap.get("Kiwi")); // to get the value using key
        System.out.println(fruitMap.containsKey("Orange")); // returns boolean true
        System.out.println(fruitMap.containsKey("orange")); // case sensitive, false
        System.out.println(fruitMap.containsValue(20.0)); // returns boolean true
        System.out.println(fruitMap.size()); // to get the size
        fruitMap.replace("Banana", 50.0); // replaces existing key with new value
        System.out.println(fruitMap);



    }
}
