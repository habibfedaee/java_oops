package com.syntax.class28.Tasks;

import java.util.ArrayList;

public class DrinksArrayList {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("juice");
        drinks.add("tea");
        drinks.add("wine");
        drinks.add("beer");
        drinks.add("Chai");
        drinks.add("tequila");
        drinks.add("milk");
        System.out.println(drinks);
        for (int i=0; i<drinks.size(); i++) {
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i, "water");
            }
        }
        System.out.println(drinks);
    }
}
