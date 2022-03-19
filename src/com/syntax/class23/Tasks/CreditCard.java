package com.syntax.class23.Tasks;

public class CreditCard {
    double balance, interest;
    CreditCard(){
    }
    CreditCard(double balance, double interest){
        this.balance=balance; this.interest=interest;
    }
    double calcInterest(){
        return balance*interest;
    }
}
class Visa extends CreditCard{
    Visa(){

    }
    Visa(double balance, double interest){
        this.balance=balance; this.interest=interest;
    }
    double calcInterest(){
        return balance*interest;
    }
}
class AX extends CreditCard{
    AX(){

    }
    AX(double balance, double interest){
        this.balance=balance; this.interest=interest;
    }
    double calcInterest(){
        return balance*interest;
    }
}

