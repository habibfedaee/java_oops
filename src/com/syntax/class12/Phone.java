package com.syntax.class12;

public class Phone {
    String model, make, owner;

    void call(){
        System.out.println(owner+"'s "+model+" is calling");
    }

    void ring(){
        System.out.println(owner+"'s "+model+" is ringing");
    }

    void takingPicture(){
        System.out.println(owner+"'s "+model+" is taking picture");
    }

    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.make = "Apple";         iphone.model = "iphone Pro Max";     iphone.owner = "Alex";
        iphone.call();       iphone.ring();         iphone.takingPicture();

        Phone Pixel = new Phone();
        Pixel.make = "Google";     Pixel.model = "Pixel Pro";     Pixel.owner = "Loly";
        Pixel.call();      Pixel.ring();    Pixel.takingPicture();

        Phone Nokia = new Phone();
        Nokia.make = "Nokia";         Nokia.model = "Nokia N10";         Nokia.owner = "Aby";
        Nokia.call();     Nokia.ring();   Nokia.takingPicture();
    }
}
