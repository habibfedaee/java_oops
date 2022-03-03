package com.syntax.class16;

public class Task5 {
    public static void main(String[] args) {
        // check a string if it is a palindrome or not
        // palindrome = aba, bob, mom, etc.

        String s1 = "aba";
        String s2 = "abb";
        Task5 task5 = new Task5();
        System.out.println(task5.isPalindrome(s1));
        System.out.println(task5.isPalindrome(s2));


    }
    boolean isPalindrome(String inputStr){
        Task5 task5 = new Task5();
        String reversedStr = task5.reverseString(inputStr);
        return  (reversedStr.equals(inputStr)) ? true : false;

    }

    String reverseString(String inputString) {
        //converting string to stringBuilder so that we can use the reverse method
        StringBuilder sb = new StringBuilder(inputString);
        sb.reverse();
        return sb.toString();

    }
}
