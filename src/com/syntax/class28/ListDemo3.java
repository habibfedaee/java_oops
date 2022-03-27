package com.syntax.class28;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ListDemo3 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("java");
        courses.add("java");
        courses.add("selenium");
//        courses.replaceAll(s -> {
//            if(s.equals("Java")){
//                return "Happy";
//            } else {
//                return s;
//            }
//        }); // replace all to "Java"
    }
}
