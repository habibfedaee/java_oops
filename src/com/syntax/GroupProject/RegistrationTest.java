package com.syntax.GroupProject;

public class RegistrationTest {
    public static void main(String[] args) {
        Registration reg = new Registration();
        reg.setEmail("myemail@yahoo.com");
        reg.setUserName("myEmail");
        reg.setPassword("password123");

        System.out.println("Email: "+reg.getEmail());
        System.out.println("Username: "+reg.getUserName());
        System.out.println("Password: "+reg.getPassword());
    }
}
