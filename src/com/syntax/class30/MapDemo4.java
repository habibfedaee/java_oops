package com.syntax.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 18.1);
        fruitMap.put("Orange", 15.3);
        fruitMap.put("Kiwi", 105.8);
        fruitMap.put("Mango", 20.0);
        System.out.println(fruitMap);
        /*
         remove entries with letter 'e' and price >= 20
         we use map.KeySet() to get all the keys from the map
        */
        Iterator<String> key_itr= fruitMap.keySet().iterator();
        while(key_itr.hasNext()){
            String key = key_itr.next();
            Double value= fruitMap.get(key);
            if(key.contains("e")&& value >=20){
                key_itr.remove();
            }

        }
        System.out.println(fruitMap);


    }
}
