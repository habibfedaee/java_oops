package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("java");
        courses.add("git");
        int java_index = courses.indexOf("java");
        String java = courses.get(java_index);
        System.out.print(java_index+":\t"+java);
    }
}
