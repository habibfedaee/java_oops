package com.syntax.class28.Tasks;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class NoDuplicateArrayList {
    public static void main(String[] args) {
        // remove duplicates from following list:
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        // output with duplicates
        System.out.println(aList);
        // using LinkedHashSet from a List add all but duplicates
        LinkedHashSet<String> hashSet = new LinkedHashSet<>(aList);
        //reassigning list with no duplicates to the aList list
        aList = new ArrayList<>(hashSet);
        // output without duplicates
        System.out.println(aList);
    }
}
