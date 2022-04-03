package com.syntax.class28.Tasks;
public abstract class Insurance {
    String insuranceName; Double insuranceAmount; abstract void getQuote(); abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;
    Car(String carModel, String insuranceName, double insuranceAmount){
        super(); this.carModel=carModel; this.insuranceName=insuranceName; this.insuranceAmount=insuranceAmount; }
    @Override
    void getQuote() {
        System.out.println("- Car Model: "+carModel+",\n\tInsurance Name: "+insuranceName+",\n\tInsurance Amount:"+insuranceAmount); }
    @Override
    void cancelInsurance() {
        System.out.println(this.getClass().getSimpleName()+" insurance cancelled");
    }
}
class Pet extends Insurance{
    String petType;
    Pet(String petType, String insuranceName, double insuranceAmount){
        super();   this.petType=petType;  this.insuranceName=insuranceName; this.insuranceAmount=insuranceAmount; }
    @Override
    void getQuote() {
        System.out.println("- Pet Type: "+petType+",\n\tInsurance Name: "+insuranceName+",\n\tInsurance Amount:"+insuranceAmount); }
    @Override
    void cancelInsurance() {
        System.out.println(this.getClass().getSimpleName()+" insurance cancelled");
    }
}
class Health extends Insurance{
    String holder;
    Health(String holder, String insuranceName, double insuranceAmount){
        super(); this.holder=holder; this.insuranceName=insuranceName; this.insuranceAmount=insuranceAmount; }
    @Override
    void getQuote() {
        System.out.println("- Insurance Holder: "+holder+",\n\tInsurance Name: "+insuranceName+",\n\tInsurance Amount:"+insuranceAmount); }
    @Override
    void cancelInsurance() {
        System.out.println(this.getClass().getSimpleName()+" insurance cancelled");
    }
}
