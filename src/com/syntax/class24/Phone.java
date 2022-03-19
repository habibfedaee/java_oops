package com.syntax.class24;

public abstract class Phone {
   public abstract void ring();
    void makePhoneCall(){
       System.out.println("Making a phone call");
   }
   void sendText(){
       System.out.println("sending text");
   }
   void displayPicture(){
       System.out.println("here is the picture");
   }
}
class Iphone extends Phone{
    public void ring(){
        System.out.println("iphone rings");
    }
    @Override
    void displayPicture() {
        System.out.println("use photo app to display the pictures");
    }
}
class Galaxy extends Phone{
    public void ring(){
        System.out.println("galaxy rings");
    }
    @Override
    void displayPicture() {
        System.out.println("use gallery to display pictures");
    }
}
