package com.syntax.TestCodes;

public class Method {
    static int sum2D(int[][] array){
        int sum=0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                sum+=array[i][j];
            }

        } return sum;
    }
}
