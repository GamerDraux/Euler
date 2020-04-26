package com.Euler.problem7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What prime are you looking " +
                "for?");
        int targetPrime = input.nextInt();
        int primeCounter = 0;
        long checkNumber = 1;
        do {
            checkNumber++;
            if (Prime.prime(checkNumber)){
                primeCounter++;
            }
        } while (primeCounter<targetPrime);
        System.out.print("Prime #"+targetPrime+" in " +
                "sequence is: "+checkNumber);
    }
}
