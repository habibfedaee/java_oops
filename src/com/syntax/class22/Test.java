package com.syntax.class22;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static String maxLength(String[] words){
        String max = "";
        for(int i=0; i< words.length-1; i++){
            for(int j=0; j<words[i].length(); j++){
                if(words[i].length()> words[i+1].length()){
                    max = words[i];
                } else {
                    max = words[i+1];
                }
            }
        }

        // return the largest element
        return max;
    }

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
//        Arrays.sort(arr);
//
//        System.out.println(Arrays.toString(arr));
        System.out.println(maxLength(arr));
        //should print "this is long"
    }

}
