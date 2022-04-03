package com.syntax.class28.Tasks;
import java.util.ArrayList;
import java.util.Iterator;

public class CarsArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Corvette");
        cars.add("Ford");
        cars.add("Hunda");

        // first way to retrieve values:
        Iterator<String> itr = cars.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+", ");
        }
        System.out.println();
        // second way to retrieve values:
        for (String car:
              cars) {
            System.out.print(car+", ");
        }
        System.out.println();
        // third way to retrieve values:
        for (int i = 0; i <cars.size() ; i++) {
            System.out.print(cars.get(i)+", ");
        }
    }
}
