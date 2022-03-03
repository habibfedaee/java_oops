package com.syntax.class16;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        String str = "Sunday is great";
        Task4 task4 = new Task4();
//        System.out.println(task4.reverseString(str));

        String[] strArray = str.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(task4.reverseString(strArray[i] + " "));
        }


    }

    String reverseString(String inputString) {
        //converting string to stringBuilder so that we can use the reverse method
        StringBuilder sb = new StringBuilder(inputString);
        sb.reverse();
        return sb.toString();

    }
}
