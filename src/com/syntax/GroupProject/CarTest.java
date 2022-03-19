package com.syntax.GroupProject;

public class CarTest {
    public static void main(String[] args) {
        Sedan s1 = new Sedan(5000.0, 18);
        System.out.println("Car price before Sales: "+s1.carPrice);
        System.out.println("Car sales price: "+s1.calculateSalePrice());
        System.out.println("Car Total Price: "+(s1.carPrice - s1.calculateSalePrice())+"\n");

        Truck t1 = new Truck(50000.0, 200);
        System.out.println("Truck price before Sales: "+t1.carPrice);
        System.out.println("Truck sales price: "+t1.calculateSalePrice());
        System.out.println("Truck Total Price: "+(t1.carPrice - t1.calculateSalePrice())+"\n");
    }
}
