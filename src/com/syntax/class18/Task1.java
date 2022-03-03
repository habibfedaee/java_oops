package com.syntax.class18;

public class Task1 {

    // Task 1: protected method
    protected int calculateSum(int[] array){
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }
        return sum;
    }

    // Task 2: public method
    public String reverseString(String str){
        String reversed = "";
        for(int i=str.length()-1; i>=0; i--){
            reversed+=str.charAt(i)+"";
        }
        return reversed;
    }

    // Task 3: private
    private String vowels(String str){
//        String vowel ="";
//        for(int i=0; i<str.length(); i++) {
//            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'||
//                    str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
//                    str.charAt(i) == 'u')
//
//
//                        vowel+=str.charAt(i)+"";
//        }
        // shorter way:
        return str.replaceAll("[^aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        Task1 t1 = new Task1();
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(t1.calculateSum(array));
        System.out.println(t1.reverseString("Hola"));
        System.out.println(t1.vowels("Baby what is up?"));
    }
}
