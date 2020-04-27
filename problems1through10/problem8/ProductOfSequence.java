package com.Euler.problems1through10.problem8;

public class ProductOfSequence {
    public static long productOfSequence(char[] arr){
        long sum = 1;
        for (char c : arr) {
            sum = sum*Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }
}
