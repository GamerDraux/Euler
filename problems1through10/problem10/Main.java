package com.Euler.problems1through10.problem10;

public class Main {
    public static void main(String[] args){
        long counter= 2000000;
        long sum =0;
        for (long i =2; i<counter; i++){
            if (i<=5||(LastDigit.lastDigit(i)==1||LastDigit.lastDigit(i)==3||LastDigit.lastDigit(i)==7||LastDigit.lastDigit(i)==9)) {
                if (Prime.prime(i)) {
                    System.out.println(i);
                    sum += i;
                }
            }
        }
        System.out.println("Lots of primes!  Adds up to "+sum);
    }
}
