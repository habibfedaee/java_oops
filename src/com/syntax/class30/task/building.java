package com.syntax.class30.task;

import java.util.*;

public class building {
    public static void main(String[] args) {
        Map<Integer, String> buildings = new HashMap<>();
        buildings.put(1, "google");
        buildings.put(2, "syntax");
        buildings.put(3, "tesla");
        buildings.put(1, "amazon");
        buildings.put(4, "batch11");
        buildings.put(5, "syntax");
        buildings.put(7, "microsoft");
        System.out.println(buildings);
        System.out.println(buildings.size());
        buildings.replace(4, "batch 12"); // updated
        System.out.println(buildings);
        buildings.remove(7);
        System.out.println(buildings);



    }
}
