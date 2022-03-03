package com.syntax.class18;

public class Accounts {

    private String userName = "Teyfur";
    private String password = "Admin";
    public String accountNumber= "123456";
    private double balance=1500;

    private void printUserName(){
        System.out.println(userName);
    }

    private void printPassword(){
        System.out.println(password);
    }

    private void printBalance(){
        System.out.println(balance);
    }

    public void printAccountNumber(){
        System.out.println(accountNumber);
    }

    public static void main(String[] args) {
        Accounts account = new Accounts();
        account.printUserName();
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();
    }
}
