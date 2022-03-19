package com.syntax.class15;

public class Test {

    String toLower(String str){
        return str.toLowerCase();
    }

    String toUpper(String str){
        return str.toUpperCase();
    }

    String toTitleCase(String str){
        StringBuilder converted = new StringBuilder();

        boolean convertNext = true;
        for (char ch : str.toCharArray()) {
            if (Character.isSpaceChar(ch)) {
                convertNext = true;
            } else if (convertNext) {
                ch = Character.toTitleCase(ch);
                convertNext = false;
            } else {
                ch = Character.toLowerCase(ch);
            }
            converted.append(ch);
        }

        return converted.toString();
    }

    public static void main(String[] args) {

        String str = "I hope you are doing well.";
        for(String word: str.split(" ")) System.out.println(word);


    }
}
