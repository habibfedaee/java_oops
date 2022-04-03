package com.syntax.class28.Tasks;
import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {
    public static void main(String[] args) {
        System.out.println("=============================CARS===============================================");
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Corolla", "AAA", 220));
        cars.add(new Car("Camry", "Formers", 180));
        cars.add(new Car("Land Cruiser", "AllState", 150));
        for (int i=0; i< cars.size(); i++) { cars.get(i).getQuote(); }
        System.out.println("=============================PETS===============================================");
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Pet("bird", "insurance A", 40));
        pets.add(new Pet("cat", "insurance B", 50));
        pets.add(new Pet("dog", "insurance C", 70));
        for (Pet pet: pets) { pet.getQuote(); }
        System.out.println("=============================HEALTH===============================================");
        ArrayList<Health> healthList = new ArrayList<>();
        healthList.add(new Health("Ahmad", "Healthnet", 300));
        healthList.add(new Health("Ali", "Monilla", 250));
        healthList.add(new Health("Bashir", "Kaiser", 330));
        Iterator<Health> healthItr = healthList.iterator();
        while(healthItr.hasNext()){
            healthItr.next().getQuote();}
    }
}
