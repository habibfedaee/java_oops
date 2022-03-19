package com.syntax.class23.Tasks;

public class Tester {
    public static void main(String[] args) {
        Degree hs = new Degree();
        hs.getPrerequisite();

        Bachelors bc = new Bachelors();
        bc.getPrerequisite();

        Masters ms = new Masters();
        ms.getPrerequisite();

        System.out.println("------------------------------------------------------");
        CreditCard cr = new CreditCard(300000, 3.1);
        System.out.println("CreditCard: "+cr.calcInterest());

        Visa vs = new Visa(20000, 4.0);
        System.out.println("Visa Card: \t"+vs.calcInterest());

        AX ax = new AX(250000, 2.5);
        System.out.println("AX Card: \t"+ax.calcInterest());
    }
}
