package com.syntax.class15;

public class Task_Reverse_String {
    public static void main(String[] args) {
        String str = "Sunday";
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i)+"");

        }
    }
}
