package com.Euler.problem9;

public class IsPythagoreanTriplet {
    public static boolean isPythagoreanTriplet(int a,
                                               int b,
                                               int c){
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }
}
