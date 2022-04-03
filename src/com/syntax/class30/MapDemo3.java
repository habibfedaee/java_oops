package com.syntax.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 18.1);
        fruitMap.put("Orange", 15.3);
        fruitMap.put("Kiwi", 12.8);
        fruitMap.put("Mango", 20.0);
        System.out.println(fruitMap);

        // to remove entries based on values, need to use iterator
        // we need to grab values from map using .values() that returns Collection
         Collection<Double> values = fruitMap.values();
        System.out.println(values);
         Iterator<Double> valItr = values.iterator();
         while(valItr.hasNext()){
             if(valItr.next()==20.0){
                 valItr.remove();
             }
         }
        System.out.println(fruitMap);
    }
}
