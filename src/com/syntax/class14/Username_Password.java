package com.syntax.class14;
import java.util.Scanner;

public class Username_Password {

    // method to get the username:
    String getUsername(){
        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        return input.nextLine();
    }
    // method to get the password:
    String getPassword(){
        Scanner input = new Scanner(System.in);
        System.out.print("Password: ");
        return input.nextLine();
    }
    // method to get the confirmed password:
    String confirmPass(){
        Scanner input = new Scanner(System.in);
        System.out.print("Confirm Password: ");
        return input.nextLine();
    }

    public static void main(String[] args) {
        // initializing variables:
        String username, pass1, pass2=null;
        Username_Password obj = new Username_Password();
        // getting username:
        username= obj.getUsername();
        while(username.isEmpty()){
            System.out.println(" (Username cannot be empty!)");
            username= obj.getUsername();
        }
        // getting password:
        pass1=obj.getPassword();
        while(pass1.isEmpty()){
            System.out.println(" (Password cannot be empty!)");
            pass1=obj.getPassword();
        }
        if(pass1.contains(username)){
            System.out.println(" (Password cannot contain username!)");
            pass1 = obj.getPassword();
        } else if(pass1.length()<8){
            System.out.println(" (Password too Short!)");
            pass1= obj.getPassword();
        }
        // confirm password:
        pass2 = obj.confirmPass();
        if(!pass1.equals(pass2)){
            System.out.println(" (Passwords do not match!)");
        } else if(pass1.equals(pass2)) {
            System.out.println(" (Your username and password has been created!)");
        }
    }
}
