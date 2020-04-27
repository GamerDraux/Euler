package com.Euler.problems1through10.problem3;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Go ahead, challenge me, " +
                "give me a big number to find the largest" +
                " primeFactor of:");
        long inputNumber;
        long number;
        long primeFactor = 1;
        inputNumber = input.nextLong();
        number = inputNumber;
        do {
            primeFactor +=1;
            System.out.println("primeFactor" +primeFactor);
            if (Prime.prime(primeFactor)) {
                while (number % primeFactor == 0) {
                    number /= primeFactor;
                }
            }



        } while (primeFactor < (inputNumber/2));
        System.out.println("The largest Prime " +
                "Factor of "+inputNumber+" is "+primeFactor);
    }

}
