package com.syntax.class28.Tasks;

public abstract class Card {
    String creditCardType; abstract void displayBalance();
    void displayCardType(){
        System.out.println("Card type: "+creditCardType);
    }
}
class Visa extends Card{
    double initialBalance;
    Visa(String type, double initialBalance){
        super(); this.creditCardType=type; this.initialBalance=initialBalance; }
    @Override
    void displayBalance() {
        System.out.println("Balance in "+this.creditCardType+" : "+this.initialBalance);
    }
}
class MasterCard extends Card{
    double initialBalance;
    MasterCard(String cardType, double initialBalance){
        this.creditCardType=cardType; this.initialBalance=initialBalance;
    }
    @Override
    void displayBalance(){
        System.out.println("Balance in "+this.creditCardType+" : "+this.initialBalance);
    }
}
class AX extends Card{
    double initialBalance;
    AX(String cardType, double initialBalance){
        this.creditCardType=cardType; this.initialBalance=initialBalance;
    }
    @Override
    void displayBalance(){
        System.out.println("Balance in "+this.creditCardType+" : "+this.initialBalance);
    }
}

