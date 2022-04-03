package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 18.1);
        fruitMap.put("Orange", 15.3);
        fruitMap.put("Kiwi", 12.8);
        fruitMap.put("Mango", 20.0);
        // to get all the keys from map into a set collection
        Set<String> keys = fruitMap.keySet();
        System.out.println(keys);
        // to remove multiple entries from map we use iterator
        Iterator<String> itr = keys.iterator();
        while (itr.hasNext()){
            if(itr.next().contains("e")){
                itr.remove();
                System.out.println("haha");
            }
        }
        System.out.println(fruitMap);
    }
}
