package com.syntax.class22.Task;

public class UserClass {
    String name="default name", mobile_number="000-00-0000", address="default address";
    UserClass(){

    }
    UserClass(String name, String mobile_number, String address){
        this.name = name; this.mobile_number=mobile_number; this.address=address;
    }

    void userDetails(){
        System.out.println("Name \t"+name);
        System.out.println("Mobile \t" +mobile_number);
        System.out.println("Address "+address);
    }
}

class UserTest {
    public static void main(String[] args) {
        UserClass user = new UserClass("Balboa", "916-22-1133", "Backersfield, CA");
        user.userDetails();
    }
}
