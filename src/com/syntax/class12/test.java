package com.syntax.class12;

public class test {
    public static void main(String[] args) {
        double[][] a = {
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };
        // new 2d array holding doubled elements from array a
        double[][] b = new double[a.length][a[0].length];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                b[i][j]=a[i][j]*2;
            }
        }

        // printing array
        for(double[] row : b){
            for(double col : row){
                System.out.print(col+" ");
            }
            System.out.println("");
        }

    }
}
