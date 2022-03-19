package com.syntax.GroupProject;

public abstract class Car {
    double carPrice;
    String color;
   abstract double calculateSalePrice();

}

class Sedan extends Car{
    double length;

    Sedan(double price, double length){
        this.carPrice=price; this.length=length;
    }
    @Override
    double calculateSalePrice() {
        if(this.length>20){
            return this.carPrice*(.05);
        } else {
            return this.carPrice*(.10);
        }

    }
}
class Truck extends Car{
    double weight;

    Truck(double price, double weight){
        this.carPrice=price; this.weight=weight;
    }
    @Override
    double calculateSalePrice() {
        if(this.weight>2000){
            return this.carPrice*(.10);
        } else {
            return this.carPrice*(.20);
        }

    }
}