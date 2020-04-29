package com.Euler.problem12;

public class FindDivisors {
    public static int findDivisors(int n){
        int counter=0;
        for (int i = 1; i<Math.sqrt(n); i++){
            if (n%i==0){
                counter++;
            }
        }
        return counter;
    }
}
