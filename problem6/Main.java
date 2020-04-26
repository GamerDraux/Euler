package com.Euler.problem6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("This program is to see the " +
                "difference between the sum of the square" +
                " of sequential numbers, and the square " +
                "of the sum of the same sequence");
        System.out.println("How many numbers would you " +
                "like to try?");
        int length = input.nextInt();
        int result1 =  SumOfSquares.sumOfSquares(length);
        int result2 = SquareOfSum.squareOfSum(length);
        System.out.println("The sum of the " +
                        "square of the first " +
                        +length+" numbers is: "+
                         result1);
        int diff;
        if(result1>result2){diff =
                result1-result2;}else{diff =
                result2-result1;};
        System.out.println("The square of the " +
                "sums, on the other hand, is: "+result2);
        System.out.println("Which makes the difference of" +
                " the the sum of squares and the square " +
                "of sums: "+ (diff));
    }
}
