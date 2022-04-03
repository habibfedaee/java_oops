package com.syntax.class28.Tasks;

import java.util.ArrayList;

public class EvenNumbersArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
//        for(int i=0; i<=500; i++){
//            if(i%2==0 && i%5!=0){
//                evenNumbers.add(i);
//            }
//        }  // or:
        for(int i=0; i<=500; i++){
            if(i%2==0){
                evenNumbers.add(i);
            }
        }
        for (int i = 0; i < evenNumbers.size(); i++) {
            if(evenNumbers.get(i)%5==0){
                evenNumbers.remove(i);
            }
        }
        System.out.println(evenNumbers);
    }
}
