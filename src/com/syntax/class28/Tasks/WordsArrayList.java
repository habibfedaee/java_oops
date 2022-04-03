package com.syntax.class28.Tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class WordsArrayList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("exiting");
        words.add("nice");
        words.add("duplicate");
        words.add("java");
        words.add("store");
        System.out.println(words);

        Iterator<String> itr = words.iterator();
        while(itr.hasNext()){
            if(itr.next().endsWith("e")){
                itr.remove();
            }
        }

        System.out.println(words);
    }
}
