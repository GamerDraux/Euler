package com.Euler.problem8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int largestSum = 0;
        char[] largestString = new char[0];
        Scanner input = new Scanner(System.in);
        System.out.println("How long of a string do you " +
                "want to test for the largest product of?");
        int length = input.nextInt();
//        System.out.println(SumOfSequence.sumOfSequence(CreateTestArray.createTestArray(0, length)));
        for (int i = 0; i<1001-length; i++){
            if (ProductOfSequence.productOfSequence(CreateTestArray.createTestArray(i,length))>largestSum){
                largestSum=
                        ProductOfSequence.productOfSequence(CreateTestArray.createTestArray(i,length));
                largestString=
                        CreateTestArray.createTestArray(i
                                ,length);
            }
        }
        System.out.println("The sequence '"+ Arrays.toString(largestString) +"' creates the largest sum of a "+length+" sequence, which is:"+largestSum);

    }
}
