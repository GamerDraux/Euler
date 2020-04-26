package com.Euler.problem6;

public class SumOfSquares {
    public static int sumOfSquares(int n){
        int sum=0;
        for (int i=1; i<n+1; i++){
            sum+=Math.pow(i,2);
        }
        return sum;
    }
}
