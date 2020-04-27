package com.Euler.problems1through10.problem6;

public class SquareOfSum {
    public static int squareOfSum(int n){
        int result=0;
        for (int i = 1; i<n+1; i++){
            result+=i;
        }
        result = (int) Math.pow(result, 2);
        return result;
    }
}
