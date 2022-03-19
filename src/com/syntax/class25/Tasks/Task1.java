package com.syntax.class25.Tasks;

class Computer{
    String make;

    public Computer(String make) {
        this.make = make;
    }
    void login(){
        System.out.println("Use username and password to login");
    }
}

class Apple extends Computer{

    public Apple(String make) {
        super(make);
    }

    @Override
    void login() {
        System.out.println("use fingerprint to login");
    }
}
class Lenovo extends Computer{

    public Lenovo(String make) {
        super(make);
    }

    @Override
    void login() {
        System.out.println("use windows hello to login");
    }
}
class HP extends Computer{

    public HP(String make) {
        super(make);
    }

    @Override
    void login() {
        System.out.println("use the keyboard and mouse to login");
    }
}
class Dell extends Computer{

    public Dell(String make) {
        super(make);
    }

    @Override
    void login() {
        System.out.println("use username and password to login");
    }
}

public class Task1 {
    // create a class as Computer that will have 4 subclasses as Apple, Lenovo, Dell, HP.
    // define common behavior within the same fields in parent class and override some methods in child
    // classes,
    // define some methods specific to child classes
    // create objected of child classes and store them into array. Loop through each obj and execute
    // available methods.
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo("Lenovo");
        lenovo.login();

        Apple apple = new Apple("apple");
        apple.login();
    }


}
