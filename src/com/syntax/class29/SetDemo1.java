package com.syntax.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("C");
        System.out.println("array list "+arrayList);
        // type conversion between sets use the constructor
        // ArrayList to LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(arrayList);
        System.out.println("linkedHashSet "+linkedHashSet);
        // ArrayList to TreeSet
        TreeSet<String> treeSet = new TreeSet<>(arrayList);
        System.out.println("treeSet "+treeSet);

    }
}
