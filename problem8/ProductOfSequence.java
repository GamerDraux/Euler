package com.Euler.problem8;

public class ProductOfSequence {
    public static int productOfSequence(char[] arr){
        int sum = 1;
        for (char c : arr) {
            sum = sum*Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }
}
