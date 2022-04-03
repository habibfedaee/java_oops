package com.syntax.class28.Tasks;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class CardTest {
    public static void main(String[] args) {
        // Visa Cards
        List<Visa> visaCards = new LinkedList<>();
        visaCards.add(new Visa("VisaCard", 2000.0));
        visaCards.add(new Visa("VisaCard", 2500.0));
        visaCards.add(new Visa("VisaCard", 2500.0));
        for (Visa visa: visaCards) { visa.displayCardType(); visa.displayBalance(); }
        // Master Cards
        System.out.println("-----------------------------------------------------");
        List<MasterCard> masterCards = new LinkedList<>();
        masterCards.add(new MasterCard("MasterCard", 1200.0));
        masterCards.add(new MasterCard("MasterCard", 1300.0));
        masterCards.add(new MasterCard("MasterCard", 1400.0));
        for (int i = 0; i < masterCards.size() ; i++) {
            masterCards.get(i).displayCardType(); masterCards.get(i).displayBalance(); }
        // AX
        System.out.println("-----------------------------------------------------");
        List<AX> axList = new LinkedList<>();
        axList.add(new AX("AX Card", 1000.0));
        axList.add(new AX("AX Card", 1300.0));
        axList.add(new AX("AX Card", 1500.0));
        Iterator<AX> axIterator = axList.iterator();
        while(axIterator.hasNext()){ axIterator.next().displayBalance(); } }
}
