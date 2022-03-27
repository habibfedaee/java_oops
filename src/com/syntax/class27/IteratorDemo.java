package com.syntax.class27;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("java");
        courses.add("java");
        courses.add("selenium");
        Iterator<String> iterator = courses.iterator();
        while(iterator.hasNext()){ // loop while iterator hasNext() element
            //print all the elements using iterator.next()
            System.out.println(iterator.next());
        }
    }
}
