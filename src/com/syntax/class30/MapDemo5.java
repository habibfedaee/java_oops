package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 18.1);
        fruitMap.put("Orange", 15.3);
        fruitMap.put("Kiwi", 105.8);
        fruitMap.put("Mango", 20.0);
        System.out.println(fruitMap);

        // entry.Set is a box inside we have boxes with keys and values
        System.out.println(fruitMap.entrySet());
        // getting the entries aka small boxes that contains the keys and values together
        for(Map.Entry<String, Double> entry : fruitMap.entrySet()){
//            System.out.println(entry);
            System.out.println("Key: "+entry.getKey()+"\tValue: "+entry.getValue());
        }

    }
}
