package com.syntax.class14;
import java.util.Scanner;
public class Task_Username {

    // Accept username, pass and confirm pass from a user, check the following:
    // 1. Username & Password cannot be empty, if so --> msg="Username & Password cannot be empty".
    // 2. Password should be minimum 8 characters, if less --> msg="Password too short".
    // 3. Password cannot contain username, if so --> msg="Password cannot contain username".
    // 4. Password should match confirmed password, if not --> msg="passwords don't match!".
    // If all conditions passed, msg="Your username and password has been created".
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username=null; String password=null;
        boolean restart = false;
        while(restart=true){
            System.out.print("Username: ");
            username = input.nextLine();
            while(username.isEmpty()){
                System.out.println("Username cannot be empty!");
                System.out.print("Username: ");
                username = input.nextLine();
            }
            System.out.print("Password: ");
            String pass1 = input.nextLine();
            while(pass1.isEmpty()){
                System.out.println("Password cannot be empty");
                System.out.print("Password: ");
                pass1 = input.nextLine();
            }
            while(pass1.length()<8){
                System.out.println("Password too short!");
                System.out.print("Password: ");
                pass1 = input.nextLine();
            }
            while(pass1.contains(username)){
                System.out.println("Password cannot contain username!");
                System.out.print("Password: ");
                pass1 = input.nextLine();
            }
            System.out.print("Confirm Password: ");
            String pass2 = input.nextLine();
            if(!pass1.equals(pass2)){
                System.out.println("Passwords do not match!");
                restart=true;
            }else {
                restart=false;
                System.out.println("Your username and password has been created!");
                break;
            }
        }
    }
}

