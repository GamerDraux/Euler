package com.Euler.problem14;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Long largestResult=0L;
        Long numberWithLargestChain = null;
        Long currentResult;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to start the " +
                "checking Collatz chains at to see what " +
                "number below it creates the longest " +
                "chain");
        long startingNumber = input.nextLong();
//        Long startingNumber = 1000000L;
        for (long i=startingNumber; i>0; i--){
            currentResult =
                    RunCollatzSequence.runCollatzSequence(i);
            System.out.println("Number:"+i+" Chain size:"+currentResult);
            if (currentResult>largestResult){largestResult=currentResult;numberWithLargestChain=i;}
        }
        System.out.println("The number with the largest " +
                "result is: "+numberWithLargestChain+".  " +
                "It has a chain of "+largestResult+" " +
                "steps");
    }
}
