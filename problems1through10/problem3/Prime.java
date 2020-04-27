package com.Euler.problems1through10.problem3;

public class Prime {
    public static boolean prime(long number) {
        boolean isPrime = true;
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
