package com.syntax.class27;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo2 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("java");
        courses.add("java");
        courses.add("selenium");
        Iterator<String> iterator = courses.iterator();
        System.out.println(courses);
        //remove all indexes with given value in list


        while(iterator.hasNext()){
            if(iterator.next().equals("java")){
                iterator.remove();
            }
        }
        System.out.println(courses);

    }
}
