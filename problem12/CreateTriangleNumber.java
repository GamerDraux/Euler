package com.Euler.problem12;

public class CreateTriangleNumber {
    public static int createTriangleNumber(int n){
        int triangle= 0;
        for (int i = 1; i<n; i++){
            triangle+=i;
        }
        return triangle;
    }
}
