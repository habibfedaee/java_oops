package com.syntax.class27;

import java.util.*;

public class ArrayListTask {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Habib");
        names.add("asghar");
        names.add("Jawed");
        names.add("mohammad");

        String checkIfEmpty = names.isEmpty() ? "empty" : "not empty";
        String checkAsgharInNames = names.contains("asghar") ? "asghar is inside" : "asghar not here";
        //------


        System.out.println(checkIfEmpty);
        System.out.println(checkAsgharInNames);
        System.out.println(names.size());
        System.out.println(names);

    }
}
